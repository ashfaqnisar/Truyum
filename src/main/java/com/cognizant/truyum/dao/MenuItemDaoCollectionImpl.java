package com.cognizant.truyum.dao;

import com.cognizant.truyum.models.MenuItem;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Component("menuItemDao")
public class MenuItemDaoCollectionImpl implements MenuItemDao {

    private List<MenuItem> menuItemList;

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
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
