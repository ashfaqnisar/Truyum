package com.cognizant.truyum.repositories;

import com.cognizant.truyum.models.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Set;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    Set<MenuItem> findByActiveAndDateOfLaunchBefore(boolean active, Date dateOfLaunch);
}
