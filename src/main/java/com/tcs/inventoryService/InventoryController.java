package com.tcs.inventoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	private InventoryService inventoryService;

	public InventoryController(InventoryService inventoryService) {
		this.inventoryService = inventoryService;
	}

	@PostMapping
	public Inventory postInventory(@RequestBody Inventory newInventory) {
		return inventoryService.postItem(newInventory);
	}

	@GetMapping("/{id}")
	public String isInventoryAvailable(@PathVariable("id") Long id) {
		return inventoryService.getItem(id);
	}
}
