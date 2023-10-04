package com.onlineShopping.inventory.service.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class InventoryDto {
    @Id
    private String productId;
    @NotNull
    private String productName;
    @NotNull
    private int productQuantity;
}