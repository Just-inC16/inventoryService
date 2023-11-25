package com.tcs.inventoryService;

import lombok.Data;

@Data
public class InventoryDto {
	private Long id;
	private String name;
	private Long amount;
}
