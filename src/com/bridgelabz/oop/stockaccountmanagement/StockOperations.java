package com.bridgelabz.oop.stockaccountmanagement;

import java.util.Scanner; 

public class StockOperations {
	
	public static Scanner sc = new Scanner(System.in);
	
	public Stock addStock() {
		
		Stock stock = new Stock();
		
		System.out.println("Enter the Stock Name");
		stock.setStockName(sc.next());
		
		System.out.println("Enter the Price of Stock share");
		stock.setPrice(sc.nextInt());
		
		System.out.println("Enter the Number of Shares");
		stock.setNumberOfShare(sc.nextInt());
		System.out.println(stock);
		return stock;
	}	

	public void calculateEachStockValue(Stock[] stockArray) {
		
		for (int eachStock = 0; eachStock < stockArray.length; eachStock++) {
			if(stockArray[eachStock] !=null) {
				
				Stock stock = stockArray[eachStock];
				int value = stock.getPrice() * stock.getNumberOfShare();
				System.out.println("The Value of " + stock.getStockName() + " is :" + value);
			}
			
		}
	}
	
	public void calculateTotalValue(Stock[] stockArray) {
		int total =0;
		for (int eachStock = 0; eachStock < stockArray.length; eachStock++) {
			if(stockArray[eachStock] !=null) {
				Stock stock = stockArray[eachStock];
				total = total + (stock.getPrice()*stock.getNumberOfShare());
			}
		}
		System.out.println("Total value of Stock is : "+total);
	}
	
}
