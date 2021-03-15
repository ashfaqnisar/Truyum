package com.cognizant.truyum.dao;

import com.cognizant.truyum.models.MenuItem;

import java.util.List;

public interface MenuItemDao {
    public List<MenuItem> getMenuItemListAdmin();

    public List<MenuItem> getMenuItemListCustomer();

    public void modifyMenuItem(MenuItem menu);

    public MenuItem getMenuItem(long menuItemId);
}
