package com.cognizant.truyum.dao;

import java.text.ParseException;

public class CartDaoCollectionImplTest {
    public static void main(String[] args) throws ParseException, CartEmptyException {
        testAddCartItem();
        testRemoveCartItem();
    }

    public static void testAddCartItem() throws ParseException, CartEmptyException {

        CartDao cartDao = new CartDaoCollectionImpl();
        cartDao.addCartItem(1L, 1L);
        cartDao.addCartItem(1L, 2L);

        System.out.println(cartDao.getAllCartItems(1L));

    }

    public static void testGetAllCartItems() throws CartEmptyException {
        CartDao cartDao = new CartDaoCollectionImpl();
        System.out.println(cartDao.getAllCartItems(1L));

    }

    public static void testRemoveCartItem() throws CartEmptyException {
        CartDao cartDao = new CartDaoCollectionImpl();
        cartDao.removeCartItem(1L, 1L);

        System.out.println(cartDao.getAllCartItems(1L));

    }
}
