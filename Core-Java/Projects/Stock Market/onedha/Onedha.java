package onedha;
import models.Stock;
import controllers.StockController;
import java.util.Scanner;

public class Onedha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		StockController stockcontroller = new StockController();
		stockcontroller.add();
		
		
		
		do {
			
			System.out.println("Enter the Choice");
			System.out.println("1. View Stocks");
			System.out.println("2. View Performance");
			System.out.println("3. Sort Stock");
			System.out.println("4. Search Stock");
			System.out.println("5. Display ROI");
			
			stockcontroller.add();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			 
				case 1: {
					stockcontroller.displayStocks();
					break;
				}
				case 2: {
					stockcontroller.displayPerformance();
					break;
				}
				case 3: {
					stockcontroller.sortedStock();
					break;
				}
				case 4: {
					System.out.println("Enter the stock you want to search");
					String userinput = scanner.nextLine();
					stockcontroller.searchStock(userinput);
					break;
				}
				case 5:{
					System.out.println("Enter the details of ROI");
					System.out.println("Enter the Stock Name");
					String name = scanner.nextLine();
					System.out.println("Enter the month");
					int month = scanner.nextInt();
					stockcontroller.displayRoi(name, month);
					break;
				}
				default:{
					System.out.println("You have Exited");
				}
			}
			
		}while(choice != 0);

	}

}
