package controllers;
import java.util.Comparator;

import models.Stock;

public class SortStocks implements Comparator<Stock> {
	
	public int compare(Stock stock1,Stock stock2) {
		return Double.compare(stock2.getPrice(), stock1.getPrice());
	}
	

	

}
