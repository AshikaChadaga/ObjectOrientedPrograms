package com.bridgelabz.oop.commercialdataprocessing;

import java.util.Scanner;

import com.bridgelabz.mydatastructure.LinkedList;
import com.bridgelabz.mydatastructure.MyNode;
import com.bridgelabz.mydatastructure.Queue;
import com.bridgelabz.mydatastructure.Stack;

public class StockAccount {
	
	Scanner scanner =new Scanner(System.in);
	
	LinkedList<CompanyShares> companylist =new LinkedList<>();
	
	
	public StockAccount(String symbol, int numberOfShares, double sharePrice, String dateTime) {
		
		CompanyShares shares = new CompanyShares(symbol, numberOfShares, sharePrice, dateTime);
		MyNode<CompanyShares> sharesNode = new MyNode<CompanyShares>(shares);
		companylist.add(sharesNode);

	}
	
	@Override
	public String toString() {
		
		return companylist.toString();
	}
	
}
