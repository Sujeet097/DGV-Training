package currency_convertor;
import java.util.Scanner;

import controllers.CurrencyController;

public class Currencyconvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CurrencyController currencycontroller = new CurrencyController();
		int choice;
		
		
		
		do {
			System.out.println("Enter the choice to convert currencies");
			System.out.println(" 1.USD TO INR");
			System.out.println(" 2.EUR TO INR");
			System.out.println(" 3.CAD TO INR");
			System.out.println(" 4.JPY TO INR");
			System.out.println(" 4.AUD TO INR");
			choice=scanner.nextInt();
			
			switch(choice) {
				
			case 1:{
				System.out.println("Enter the amount to convert the currency from USD to INR");
				currencycontroller.usdToInr();
				break;
			}
			case 2:{
				System.out.println("Enter the amount to convert the currency from EUR to INR");
				currencycontroller.euroToInr();
				break;
			}
			case 3:{
				System.out.println("Enter the amount to convert the currency from CAD to INR");
				currencycontroller.cadToInr();
				break;
			}
			case 4:{
				System.out.println("Enter the amount to convert the currency from JPY to INR");
				currencycontroller.jpyToInr();
				break;
			}
			case 5:{
				System.out.println("Enter the amount to convert the currency from AUD to INR");
				currencycontroller.audToInr();
				break;
			}
			default:{
				System.out.println("You have exited from the app");
			}
			}
			
		}while(choice != 0);
		

	}

}
