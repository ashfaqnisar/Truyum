package com.cognizant.truyum.models;

import java.util.Date;

public class MenuItem {
    private long id;
    private String name, category;
    private float price;
    private boolean active, freeDelivery;
    private Date dateOfLaunch;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isFreeDelivery() {
        return freeDelivery;
    }

    public void setFreeDelivery(boolean freeDelivery) {
        this.freeDelivery = freeDelivery;
    }

    public Date getDateOfLaunch() {
        return dateOfLaunch;
    }

    public void setDateOfLaunch(Date dateOfLaunch) {
        this.dateOfLaunch = dateOfLaunch;
    }

    public MenuItem(long id, String name, String category, float price, boolean active, boolean freeDelivery, Date dateOfLaunch) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.active = active;
        this.freeDelivery = freeDelivery;
        this.dateOfLaunch = dateOfLaunch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        return id == menuItem.id;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", active=" + active +
                ", freeDelivery=" + freeDelivery +
                ", dateOfLaunch=" + dateOfLaunch +
                '}';
    }
}
