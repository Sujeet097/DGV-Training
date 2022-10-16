package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import models.Stock;

public class StockController {
	ArrayList <Stock> stocks = new ArrayList<Stock>();
	
	public void add() {
			stocks.add(new Stock("Sujeet softtech","Technology",120,355,150,new double[] {124.5,135.3,129.6,146.56,148.5},25));
			stocks.add(new Stock("Ayush Industries","Food",30,167,70,new double[] {135.3,129.6,146.56,148.5},12));
			stocks.add(new Stock("George beverages","Beverages",56,210,120,new double[] {120.3,127.56,135.3,125.4,145.1},18));
			stocks.add(new Stock("Parth Finance","Fintech",230,400,200,new double[] {350.3,290.56,283.3,304.4,350.1},57));
	}
	
	  
	public void displayStocks() {
		System.out.println("Name                    "  + "Category          " + "Price " + "High52 " + "Low52 " + "Last5               " + "ROI" );
		stocks.forEach((stock)->{
			System.out.print(stock.getName()+ "         " + stock.getCategory()+ "          "+stock.getPrice());
			System.out.println();
		});
		
	}
	
	
	public void displayPerformance(){
		System.out.println("Name                    "  + "Category          " + "Price " + "High52 " + "Low52 " + "Last5               " + "ROI" );
		stocks.forEach((stock)->{
			System.out.println(stock.getName()+"   "+stock.getCategory()+"    "+stock.getPrice()+ "   "+stock.getHigh52()+"   "+stock.getLow52()+"    "+stock.getLast5()+"    "+stock.getRoi());
		});
	}
	
	public void sortedStock() {
		Collections.sort(stocks, new SortStocks());
		this.displayStocks();
	}
	
	
	public void searchStock(String userInput) {
		Optional<Stock> foundData=stocks.stream().filter((s)->{
			return s.getName().equals(userInput);
		}).findFirst();
		System.out.println(foundData.get().getName() + "  "+foundData.get().getCategory()+ "   " + foundData.get().getPrice());
		
	}
	
	public void displayRoi(String name,int month) {
		Optional<Stock> foundStock=stocks.stream().filter((s)->{
			return s.getName().equals(name);
		}).findFirst();
		System.out.println("Your profit is "+foundStock.get().getPrice()*(foundStock.get().getRoi()/100)*month);
	}

	
}
