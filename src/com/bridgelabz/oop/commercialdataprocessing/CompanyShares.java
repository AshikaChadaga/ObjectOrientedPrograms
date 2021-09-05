package com.bridgelabz.oop.commercialdataprocessing;

public class CompanyShares {
	
	private String stockSymbol;	
	private int numberOfShares;	
	private String dateTime;	
	private double price;	
	
	public CompanyShares(String symbol , int numberOfShares, double price, String dateTime) {
		this.stockSymbol = symbol;
		this.numberOfShares = numberOfShares;
		this.dateTime = dateTime;
		this.price = price;
	}
	
	public String getSymbol() {
		return stockSymbol;
	}
	
	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getDateTime() {
		return dateTime;
	}
	
	public double getValue() {
		return numberOfShares * price;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override
	public String toString() {
		
		return "\nStock Symbol: "+stockSymbol+"\nNumber Of Shares: "+numberOfShares+"\nPrice Of Share: "+price+"\nDate and Time: "+dateTime+"\n";
	}
}
