package com.onlineShopping.inventory.service.repositories;

import com.onlineShopping.inventory.service.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,String> {
}
