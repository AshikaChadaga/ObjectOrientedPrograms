package com.bridgelabz.oop.commercialdataprocessing;

import java.time.format.DateTimeFormatter; 
import java.util.Scanner;
import com.bridgelabz.mydatastructure.LinkedList;
import com.bridgelabz.mydatastructure.MyNode;
import com.bridgelabz.mydatastructure.Queue;
import com.bridgelabz.mydatastructure.Stack;

public class StockAccount {
	
	public static Scanner scannerObject = new Scanner(System.in);
	public LinkedList<CompanyShares> listOfShares;
	public DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	public Queue<String> dateAndTime = new Queue<String>();
	public Stack<String> sold = new Stack<String>();
	public Stack<String> purchased = new Stack<String>();
	public Double totalValue;
	
	 
	
	public StockAccount() {
		LinkedList<CompanyShares> listOfShares = new LinkedList<CompanyShares>();
		totalValue = 0.0;
	}
	
	public void addShare() {
		
		System.out.println("How many shares do you want to add ?");
		int shareCount = scannerObject.nextInt();
		
		while(shareCount>0) {
			
			System.out.println("Enter the below details : ");
			System.out.println("Stock Symbol");
			String stockSymbol = scannerObject.next();
			
			System.out.println("Price of each Share");
			double price = scannerObject.nextDouble();
			
			System.out.println("Number Of Shares : ");
			int numberOfShares = scannerObject.nextInt();
			
			
			CompanyShares stock = new CompanyShares(stockSymbol,numberOfShares,price);
			MyNode<CompanyShares> stockNode = new MyNode<CompanyShares>(stock);
			listOfShares.add(stockNode);
			--shareCount;
		}
	}
}
