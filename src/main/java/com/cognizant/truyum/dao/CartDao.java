package com.cognizant.truyum.dao;

import com.cognizant.truyum.models.MenuItem;

import java.text.ParseException;
import java.util.List;

public interface CartDao {
    void addCartItem(long userId, long menuItemId) throws ParseException;

    List<MenuItem> getAllCartItems(long userId) throws CartEmptyException;

    void removeCartItem(long userId, long menuItemId);
}
