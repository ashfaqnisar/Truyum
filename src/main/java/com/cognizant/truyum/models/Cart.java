package com.cognizant.truyum.models;

import java.util.List;

public class Cart {
    private List<MenuItem> menuItemList;
    private double total;

    public List<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cart(List<MenuItem> menuItemList, double total) {
        this.menuItemList = menuItemList;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "menuItemList=" + menuItemList +
                ", total=" + total +
                '}';
    }
}
