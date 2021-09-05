package com.bridgelabz.oop.commercialdataprocessing;

import java.time.LocalDateTime;

public class CompanyShares {
	
	private String stockSymbol;	
	private int numberOfShares;	
	LocalDateTime dateTime;	
	private double price;
	private double value;
	
	public CompanyShares(String symbol , int numberOfShares, double price) {
		this.stockSymbol = symbol;
		this.numberOfShares = numberOfShares;
		this.price = price;
		this.value = numberOfShares * price;
		this.setDateTime(LocalDateTime.now());
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
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	@Override 
	public String toString() {
		return "{ Stock Symbol: "+stockSymbol+" Available Shares: "+ numberOfShares+" Price : "+ price+" Date And Time : "+dateTime +" Value : "+this.getValue()+" }";
	}
}
