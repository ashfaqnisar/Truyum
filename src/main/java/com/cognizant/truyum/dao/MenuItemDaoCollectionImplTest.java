package com.cognizant.truyum.dao;

import com.cognizant.truyum.models.MenuItem;
import com.cognizant.truyum.util.DateUtil;

import java.text.ParseException;

public class MenuItemDaoCollectionImplTest {
    public static void main(String[] args) throws ParseException {
        testGetMenuItemListAdmin();
        testGetMenuItemListCustomer();
        testModifyMenuItem();
        testGetMenuItem();
    }

    public static void testGetMenuItemListAdmin() throws ParseException {
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();

        for (MenuItem menuItem : menuItemDao.getMenuItemListAdmin()) {
            System.out.println(menuItem.toString());
        }
    }

    public static void testGetMenuItemListCustomer() throws ParseException {
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();

        for (MenuItem menuItem : menuItemDao.getMenuItemListCustomer()) {
            System.out.println(menuItem.toString());
        }
    }

    public static void testModifyMenuItem() throws ParseException {
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();

        MenuItem item = new MenuItem(1L, "Sandwich", "Main Course", 99.00f, true,
                true, DateUtil.convertToDate("15/03/2017"));

        menuItemDao.modifyMenuItem(item);
    }

    public static void testGetMenuItem() throws ParseException {
        MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();

        MenuItem item = new MenuItem(1L, "Sandwich", "Main Course", 99.00f, true,
                true, DateUtil.convertToDate("15/03/2017"));

        System.out.println(menuItemDao.getMenuItem(item.getId()));
    }
}
