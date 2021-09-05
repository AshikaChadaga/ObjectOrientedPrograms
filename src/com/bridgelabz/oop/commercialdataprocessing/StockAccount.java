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
	
	public double valueOf() {
		
		totalValue = 0.0;
		
		MyNode<CompanyShares> temporaryShares = (MyNode<CompanyShares>) listOfShares.head;
		while(temporaryShares != null) {
			totalValue = totalValue + temporaryShares.getKey().getValue();
			temporaryShares = (MyNode<CompanyShares>) temporaryShares.getNext();
		}
		return this.totalValue;
	}
	
	public void buy(int sharesNumber, String symbol) {
		
		MyNode<CompanyShares> temporaryShares = (MyNode<CompanyShares>) listOfShares.head;
		
		while(temporaryShares != null) {
			
			if(temporaryShares.getKey().getSymbol().equals(symbol)) {
				
				int availableShares = temporaryShares.getKey().getNumberOfShares();
				temporaryShares.getKey().setNumberOfShares(sharesNumber + availableShares);
				
				double value = temporaryShares.getKey().getPrice() * (sharesNumber + availableShares);
				this.totalValue = value;
				temporaryShares.getKey().setValue(value);
				
				MyNode<String> stock = new MyNode<String>(symbol);
				sold.push(stock);
				System.out.println("Successfully Added "+sharesNumber+" shares to Stock- "+symbol+". Current value is "+value);
				
				temporaryShares.getKey().setDateTime(LocalDateTime.now());
				MyNode<String> currentDate = new MyNode<String>(LocalDateTime.now().format(format).toString());
				dateAndTime.enqueue(currentDate);
				return;
			}
			temporaryShares = (MyNode<CompanyShares>)temporaryShares.getNext();
		}
		System.out.println("Stock not found");
	}
	
	public void sell(int sharesAmount, String symbol) {
		
		MyNode<CompanyShares> temporaryShares = (MyNode<CompanyShares>) listOfShares.head;
		
		while(temporaryShares != null) {
			
			if(temporaryShares.getKey().getSymbol().equals(symbol)) {
				
				int currentShares = temporaryShares.getKey().getNumberOfShares();
				if(currentShares-sharesAmount < 0) {
					System.out.println("Sorry! Ran Out Of Shares!!");
					return;
				}
				temporaryShares.getKey().setNumberOfShares(currentShares-sharesAmount);
				double value = temporaryShares.getKey().getPrice() * (currentShares-sharesAmount);
				temporaryShares.getKey().setValue(value);
				this.totalValue = value;
				
				MyNode<String> stock = new MyNode<String>(symbol);
				purchased.push(stock);
				
				System.out.println("Successfully Sold "+sharesAmount+" shares of Stock "+symbol+". current value is "+value);
				
				temporaryShares.getKey().setDateTime(LocalDateTime.now());
				MyNode<String> currentDate = new MyNode<String>(LocalDateTime.now().format(format).toString());
				dateAndTime.enqueue(currentDate);
				return;
			}
			temporaryShares = (MyNode<CompanyShares>)temporaryShares.getNext();
		}
		System.out.println("Stock not found");
	}
	
	public void printReport() {
		
		System.out.println("----- STOCK REPORT -----");
		System.out.println("Total Value Of All Stocks Combined: "+ totalValue);
		listOfShares.printLinkedList();
	}
	
	
}
