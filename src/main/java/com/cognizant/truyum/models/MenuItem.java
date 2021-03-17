package com.cognizant.truyum.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "menu_item")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "me_id")
    private Long id;

    @Column(name = "me_name")
    private String name;

    @Column(name = "me_price", columnDefinition = "decimal(10,2)")
    private float price;

    @Column(name = "me_active")
    private boolean active;

    @Column(name = "me_date_of_launch")
    private Date dateOfLaunch;

    @Column(name = "me_category")
    private String category;

    @Column(name = "me_free_delivery")
    private boolean freeDelivery;

    public MenuItem() {
    }

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

        return id.equals(menuItem.id);
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
