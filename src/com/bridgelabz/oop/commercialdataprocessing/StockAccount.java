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
	
	
}
