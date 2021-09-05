package com.bridgelabz.oop.inventorymanagement;

import com.bridgelabz.oop.inventorydetails.Inventory;

public interface InventoryOperationsIF {
	
	public Inventory addInventory();
	public void calculateValue(Inventory[] inventoryArray);
}
