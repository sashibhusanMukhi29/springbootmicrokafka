package com.onlineShopping.inventory.service.serviceimp;

import com.onlineShopping.inventory.service.dto.InventoryDto;
import com.onlineShopping.inventory.service.repositories.InventoryRepository;
import com.onlineShopping.inventory.service.service.InvertoryService;

import org.springframework.stereotype.Service;




@Service
public class InventoryServiceImp implements InvertoryService {

    private InventoryRepository inventoryRepository;
    @Override
    public InventoryDto addInventoryDetails(InventoryDto inventoryDto) {


        return null ;
    }

    @Override
    public InventoryDto getInventoryDetailsById(String productId) {
        return null;
    }
}
