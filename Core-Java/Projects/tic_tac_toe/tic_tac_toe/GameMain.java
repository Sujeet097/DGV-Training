package tic_tac_toe;
import java.util.Scanner;

import Controller.GameController;
public class GameMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		GameController gamecontroller = new GameController();
		
		do 
		{
			System.out.println("Enter the choice");
			System.out.println("1. Play Game");
			System.out.println("2. Winning Streak");
			System.out.println("0. Leave the game");
			choice = scanner.nextInt();
			
			scanner.nextLine();
			switch(choice) 
			{
			case 1:{
				System.out.println("Enter First player name");
			    String player1=scanner.nextLine();
			   
				System.out.println("Enter the second player name");
				String player2 = scanner.nextLine();
				gamecontroller.addPlayer(player1,player2);
				break;
			}
			case 2:{
				
				gamecontroller.seeWinStreak();
				break;
			}
			default:{
				System.out.println("You have exited the game");
			}
			}
		} while(choice!=0);
		

	}

}
