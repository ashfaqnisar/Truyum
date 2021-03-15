package com.cognizant.truyum.dao;

import com.cognizant.truyum.models.Cart;
import com.cognizant.truyum.models.MenuItem;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CartDaoCollectionImpl implements CartDao {
    static private HashMap<Long, Cart> userCarts;

    public CartDaoCollectionImpl() {
        if (userCarts == null) {
            userCarts = new HashMap<Long, Cart>();
        }
    }

    @Override
    public void addCartItem(long userId, long menuItemId) throws ParseException {
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
        MenuItem fetchedMenuItem = menuItemDao.getMenuItem(menuItemId);

        List<MenuItem> menuItemList = new ArrayList<>();

        if (userCarts.containsKey(userId)) {
            menuItemList.addAll(userCarts.get(userId).getMenuItemList());
            menuItemList.add(fetchedMenuItem);

            Cart updatedCart = new Cart(menuItemList, 0.0);
            userCarts.put(userId, updatedCart);
        } else {
            menuItemList.add(fetchedMenuItem);
            Cart updatedCart = new Cart(menuItemList, 0.0);
            userCarts.put(userId, updatedCart);
        }
    }

    @Override
    public List<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
        List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();
        if (menuItemList.isEmpty()) {
            throw new CartEmptyException();
        }
        double totalPrice = 0.0;
        for (MenuItem menuItem : menuItemList) {
            totalPrice += menuItem.getPrice();
        }
        Cart updatedCart = new Cart(menuItemList, totalPrice);
        userCarts.put(userId, updatedCart);

        return menuItemList;
    }

    @Override
    public void removeCartItem(long userId, long menuItemId) {
        List<MenuItem> menuItemList = userCarts.get(userId).getMenuItemList();

        for (int i = 0; i < menuItemList.size(); i++) {
            if (menuItemList.get(i).getId() == menuItemId) {
                menuItemList.remove(i);
            }
        }
        Cart cart = userCarts.get(userId);
        cart.setMenuItemList(menuItemList);

        userCarts.put(userId, cart);

    }
}
