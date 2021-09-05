package com.bridgelabz.oop.commercialdataprocessing;

import java.util.Scanner;

import com.bridgelabz.mydatastructure.LinkedList;
import com.bridgelabz.mydatastructure.MyNode;
import com.bridgelabz.mydatastructure.Queue;
import com.bridgelabz.mydatastructure.Stack;

public class StockAccount {
	
	Scanner scanner =new Scanner(System.in);
	
	LinkedList<CompanyShares> companylist =new LinkedList<>();
	
	
	public StockAccount(CompanyShares[] stockArray) {
		
		for(int arrayIndex = 0; arrayIndex <stockArray.length ; arrayIndex++) {
			MyNode<CompanyShares> shares = new MyNode<CompanyShares>(stockArray[arrayIndex]);
			companylist.add(shares);
		}

	}
	
	@Override
	public String toString() {
		
		return companylist.toString();
	}
	
}
