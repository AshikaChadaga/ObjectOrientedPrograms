package com.bridgelabz.oop.commercialdataprocessing;

public class Transaction {

	public static void main(String[] args) {
		
		CompanyShares[] stockList = new CompanyShares[4];
		CompanyShares idea = new CompanyShares("Idea", 100, 10, "1/2/2018 3:48");
		CompanyShares reliance = new CompanyShares("Reliance", 120, 40, "1/6/2018 4:48");
		CompanyShares perfios = new CompanyShares("Perfios", 50, 60, "2/9/2018 4:50");
		CompanyShares netskope = new CompanyShares("Netskope", 200, 90, "15/9/2017 2:30");
		stockList[0] = idea;
		stockList[1] = reliance;
		stockList[2] = perfios;
		stockList[3] = netskope;
		
		StockAccount stockAccount = new StockAccount(stockList);
		System.out.println(stockAccount);
		
		
		double stockValue = stockAccount.valueOf();
		System.out.println("Value is : "+stockValue);
		

	}

}
