package com.cognizant.truyum.dao;

import com.cognizant.truyum.models.MenuItem;
import com.cognizant.truyum.util.DateUtil;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MenuItemDaoCollectionImpl implements MenuItemDao {

    private List<MenuItem> menuItemList;

    public MenuItemDaoCollectionImpl() throws ParseException {
        if (menuItemList == null) {
            menuItemList = new ArrayList<>();

            MenuItem item1 = new MenuItem(1L, "Sandwich", "Main Course", 99.00f, true,
                    true, DateUtil.convertToDate("15/03/2017"));
            MenuItem item2 = new MenuItem(2L, "Burger", "Main Course", 129.00f, true,
                    false, DateUtil.convertToDate("15/03/2017"));
            MenuItem item3 = new MenuItem(3L, "Pizza", "Main Course", 149.00f, true,
                    false, DateUtil.convertToDate("15/03/2017"));
            MenuItem item4 = new MenuItem(4L, "French Fries", "Starters", 57.00f, false,
                    true, DateUtil.convertToDate("15/03/2017"));
            MenuItem item5 = new MenuItem(5L, "Brownie", "Dessert", 32.00f, true,
                    true, DateUtil.convertToDate("15/03/2017"));

            menuItemList.addAll(Arrays.asList(item1, item2, item3, item4, item5));
        }
    }

    @Override
    public List<MenuItem> getMenuItemListAdmin() {
        return menuItemList;
    }

    @Override
    public List<MenuItem> getMenuItemListCustomer() {
        List<MenuItem> customerMenuItemList = new ArrayList<MenuItem>();

        for (MenuItem menuItem : menuItemList) {
            if (menuItem.getDateOfLaunch().compareTo(new Date()) < 0 && menuItem.isActive()) {
                customerMenuItemList.add(menuItem);
            }
        }
        return customerMenuItemList;
    }

    @Override
    public void modifyMenuItem(MenuItem menuItem) {
        for (int i = 0; i < menuItemList.size(); i++) {
            if (menuItemList.get(i).equals(menuItem)) {
                menuItemList.set(i, menuItem);
            }
        }
    }

    @Override
    public MenuItem getMenuItem(long menuItemId) {
        MenuItem fetchedMenuItem = null;

        for (MenuItem menuItem : menuItemList) {
            if (menuItem.getId() == menuItemId) {
                fetchedMenuItem = menuItem;
            }
        }

        return fetchedMenuItem;
    }
}
