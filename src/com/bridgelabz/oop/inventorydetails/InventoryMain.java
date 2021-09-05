package com.bridgelabz.oop.inventorydetails;

import java.util.Scanner;

public class InventoryMain {

	public static void main(String[] args) {
		
		Scanner scannerObject = new Scanner(System.in);
		
		Inventory riceObject = new Inventory();
		Inventory pulsesObject = new Inventory();
		Inventory wheatObject = new Inventory();
		
		System.out.println("----- Welcome To Inventory Management -----");
		
		System.out.println("Enter the rice brand name: ");
		riceObject.setName(scannerObject.next());
		System.out.println("Enter the rice weight: ");
		riceObject.setWeight(scannerObject.nextInt());
		System.out.println("Enter the rice price per Kg: " );
		riceObject.setPrice(scannerObject.nextInt());
		System.out.println(riceObject);
		
		System.out.println("\nEnter the pulse brand name: ");
		pulsesObject.setName(scannerObject.next());
		System.out.println("Enter the pulse weight: ");
		pulsesObject.setWeight(scannerObject.nextInt());
		System.out.println("Enter the pulse price per Kg: " );
		pulsesObject.setPrice(scannerObject.nextInt());
		System.out.println(pulsesObject);
		
		System.out.println("\nEnter the wheat brand name: ");
		wheatObject.setName(scannerObject.next());
		System.out.println("Enter the wheat weight: ");
		wheatObject.setWeight(scannerObject.nextInt());
		System.out.println("Enter the wheat price per Kg: " );
		wheatObject.setPrice(scannerObject.nextInt());
		System.out.println(wheatObject);
		
		System.out.println("\n----- Inventory Values ------");
		
		int riceCost = riceObject.getWeight() * riceObject.getPrice();
		System.out.println("Inventory Value of Rice ( "+riceObject.getName()+" ) : "+riceCost);
		
		int pulsesCost = pulsesObject.getWeight() * pulsesObject.getPrice();
		System.out.println("Inventory Value of Pulses ( "+riceObject.getName()+" ) : "+pulsesCost);
		
		int wheatCost = wheatObject.getWeight() * wheatObject.getPrice();
		System.out.println("Inventory Value of Wheat ( "+riceObject.getName()+" ) : "+wheatCost);
		
		scannerObject.close();
	}

}
