package com.onlineShopping.inventory.service.service;

import com.onlineShopping.inventory.service.dto.InventoryDto;

public interface InvertoryService {
    InventoryDto addInventoryDetails(InventoryDto inventoryDto);
    InventoryDto getInventoryDetailsById(String productId);


}
