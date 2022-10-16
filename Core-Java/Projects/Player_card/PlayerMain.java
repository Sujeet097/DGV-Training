package Main.java;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;



public class PlayerMain {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		PlayerController p = new PlayerController();
		int choice;
		
		
		do
		{
			System.out.println("Enter the choice");
			System.out.println("1. Add Player");
			System.out.println("2. View Players");
			System.out.println("3. Delete Players");
			System.out.println("4. Sort Players");
			System.out.println("4. Update Players");
			System.out.println("0. Exit");
			
			choice = input.nextInt();
			
			switch(choice)
			{
				case 1:{
					p.addPlayer();
					break;
				}
				case 2:{
					p.viewPlayers();
					break;
				}
				case 3:{
					p.deletePlayers();
					break;
				}
				case 4:{
					p.sortPlayer();
					break;
				}
				case 5:{
					p.updatePlayer();
					break;
				}
				default:{
					System.out.println("Exited the game");
				}
			}
		}
		while (choice != 0);
		
	

}
}
