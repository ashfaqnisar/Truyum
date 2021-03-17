package com.cognizant.truyum.service;

import com.cognizant.truyum.models.MenuItem;
import com.cognizant.truyum.repositories.MenuItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Service
public class MenuItemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemService.class);

    @Autowired
    private MenuItemRepository menuItemRepository;

    @Transactional
    public List<MenuItem> getMenuItemListAdmin() {
        /*Get All the  menu items*/
        LOGGER.info("Start");
        List<MenuItem> menuItemList = menuItemRepository.findAll();
        LOGGER.info("end");

        return menuItemList;
    }

    @Transactional
    public Set<MenuItem> getMenuItemListCustomer() {
        LOGGER.info("Start");
        Set<MenuItem> customerMenuItemList = menuItemRepository.findByActiveAndDateOfLaunchBefore(true, new Date());
        LOGGER.info("end");

        return customerMenuItemList;
    }

    @Transactional
    public MenuItem getMenuItem(Long menuItemId) {
        LOGGER.info("Start");
        MenuItem menuItem = menuItemRepository.findById(menuItemId).get();
        LOGGER.info("End");

        return menuItem;
    }

    @Transactional
    public void modifyMenuItem(MenuItem menuItem) {
        LOGGER.info("Start");
        menuItemRepository.save(menuItem);
        LOGGER.info("End");
    }
}
