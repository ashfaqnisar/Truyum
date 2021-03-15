package com.cognizant.truyum.dao;

import com.cognizant.truyum.models.MenuItem;

import java.util.List;

public interface MenuItemDao {
    List<MenuItem> getMenuItemListAdmin();

    List<MenuItem> getMenuItemListCustomer();

    void modifyMenuItem(MenuItem menu);

    MenuItem getMenuItem(long menuItemId);
}
