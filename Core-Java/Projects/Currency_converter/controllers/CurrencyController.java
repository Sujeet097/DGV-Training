package controllers;
import java.util.Currency;
import java.util.Scanner;

public class CurrencyController {
	    Scanner scanner = new Scanner(System.in);
	    double USD=82.54;
	    double EUR=81.37;
	    double CAD=60.52;
	    double JPY=0.56;
	    double AUD=52.47;
		double inr;
        
		public void usdToInr() {

		    double inr =scanner.nextDouble();
			USD=USD*inr;
			System.out.println(USD + " Rs.");
		}
		
		
		public void euroToInr() {

			double inr = scanner.nextDouble();
			EUR*=inr;
			System.out.println(EUR + " Rs.");
		}
		
		public void cadToInr() {

			double inr= scanner.nextDouble();
			CAD*=inr;
			System.out.println(CAD + " Rs.");
		}
		
		public void jpyToInr() {

			double inr = scanner.nextDouble();
			JPY*=inr;
			System.out.println(JPY + " Rs.");
		}
		
		public void audToInr() {

			double inr=scanner.nextDouble();
			AUD*=inr;
			System.out.println(AUD + " Rs.");
		}
	

}
