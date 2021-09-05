package com.bridgelabz.oop.inventorymanagement;

import java.util.Scanner; 

import com.bridgelabz.oop.inventorydetails.Inventory;

public class InventoryManager {
	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		
		Inventory[] inventoryArray = new Inventory[3];
		int arrayIndex = 0;
		Inventory inventoryObject = new Inventory();
		InventoryOperations operationObject = new InventoryOperations();
		
		do {
			System.out.println("1 : Add Inventory\n2 : Value Of each inventory");
			int userChoice = scannerObject.nextInt();
			switch(userChoice) {
			case 1:
				
				inventoryObject = operationObject.addInventory();
				inventoryArray[arrayIndex] = inventoryObject;
				arrayIndex++;
				break;

			case 2:
				
				operationObject.calculateValue(inventoryArray);
				break;
			}
			System.out.println("If you want to perform more Operations Enter true");
			
		}while(scannerObject.nextBoolean());
		
		scannerObject.close();
		
	}
}
