package com.bridgelabz.oop.commercialdataprocessing;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		
		System.out.println("----- Welcome to Commercial Data Processing -----");
		
		Scanner scannerObject= new Scanner(System.in);	
		StockAccount stocks = new StockAccount();
		stocks.addShare();
		stocks.valueOf();
		
		
		while(true) {
			System.out.println("Enter\n1: Add Shares\n2: Buy Stock\n3: Sell Stock\n4: Get Total Value\5: Display Stock Report\n6:Exit");
			
			int choice = scannerObject.nextInt();
			switch(choice) {
				case 1:
					stocks.addShare();
					stocks.valueOf();
					break;
				
				case 2:
					System.out.println("Enter the Stock Symbol : ");
					String stockSymbol = scannerObject.next();
					System.out.println("How many shares would you like to buy?");
					int sharesAmount = scannerObject.nextInt();
					stocks.buy(sharesAmount, stockSymbol);
					stocks.valueOf();
					break;
					
				case 3:
					System.out.println("Enter the Stock Symbol : ");
					String sellingStockSymbol = scannerObject.next();
					System.out.println("How many shares would you like to buy?");
					int sellingSharesAmount = scannerObject.nextInt();
					stocks.sell(sellingSharesAmount, sellingStockSymbol);
					stocks.valueOf();
					break;
					
				case 4:
					System.out.println("the total value of shares : " +stocks.valueOf());
					break;
					
				case 5:
					stocks.printReport();
					break;
					
				case 6: System.out.println("BYE !");
						scannerObject.close();
						System.exit(0);
				}
		}
		

	}


}
