package com.cognizant.truyum;

import com.cognizant.truyum.models.MenuItem;
import com.cognizant.truyum.service.MenuItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Set;


@SpringBootApplication
public class TruyumApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(TruyumApp.class);


    private static MenuItemService menuItemService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TruyumApp.class, args);
        menuItemService = context.getBean(MenuItemService.class);

        LOGGER.info("Start");

        testGetMenuItemListAdmin();
        testGetMenuItemListCustomer();
        testGetMenuItem();
        testModifyMenuItem();

        LOGGER.info("End");
    }

    public static void testGetMenuItemListAdmin() {
        LOGGER.info("Start");
        List<MenuItem> menuItems = menuItemService.getMenuItemListAdmin();
        LOGGER.debug("MenuItems={}", menuItems);

        LOGGER.info("End");

    }

    public static void testGetMenuItemListCustomer() {
        LOGGER.info("Start");
        Set<MenuItem> menuItems = menuItemService.getMenuItemListCustomer();
        LOGGER.debug("MenuItems={}", menuItems);

        LOGGER.info("End");

    }

    public static void testGetMenuItem() {
        LOGGER.info("Start");

        MenuItem menuItem = menuItemService.getMenuItem(3L);
        LOGGER.debug("MenuItem={}", menuItem);

        LOGGER.info("End");

    }

    public static void testModifyMenuItem() {
        LOGGER.info("Start");
        LOGGER.info("Before Modification");
        LOGGER.debug("MenuItem={}", menuItemService.getMenuItem(3L));

        MenuItem menuItem = menuItemService.getMenuItem(3L);
        menuItem.setName("Pasta");
        menuItem.setPrice(129);
        menuItemService.modifyMenuItem(menuItem);

        LOGGER.info("After Modification");
        LOGGER.debug("MenuItem={}", menuItemService.getMenuItem(3L));

        LOGGER.info("End");
    }
}

