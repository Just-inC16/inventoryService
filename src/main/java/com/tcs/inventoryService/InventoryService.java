package com.tcs.inventoryService;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
	private InventoryRepository inventoryRepository;

	public InventoryService(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}

	public Inventory postItem(Inventory newInventory) {
		return inventoryRepository.save(newInventory);
	}

	public String getItem(Long Id) {
		Long amountAvaiable = inventoryRepository.getReferenceById(Id).getAmount();
		return (amountAvaiable > 0) ? "Available" : "Not Available";
	}
}
