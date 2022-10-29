package Controller;

import java.util.Scanner;

import Model.PlayerDetails;

public class GameController {
Scanner scanner = new Scanner(System.in);

	
	int temp;
	String number[] = new String[9];
	
	PlayerDetails p1=new PlayerDetails();
	PlayerDetails p2=new PlayerDetails();	
	
	public void addPlayer(String Player1,String Player2) {
		
		number=new String[]{"1","2","3","4","5","6","7","8","9"};
		p1.setPlayer(Player1);
		p2.setPlayer(Player2);
		
		this.gamePlayFunction();
		
	}
	
	public void gamePlayFunction() {
		
		
		this.displayMatrix();
		temp=1;
		do {
			System.out.println("Enter player1 position");
			int playerInput1= scanner.nextInt();
			number[playerInput1-1]="x";
			this.displayMatrix();
			this.checkWin(playerInput1-1);
			
			if(temp==0) {
				break;
			}
			
			System.out.println("Enter player2 position");
			int playerInput2=scanner.nextInt();
			number[playerInput2-1]="O";
			this.displayMatrix();
			this.checkWin(playerInput2-1);
		}while(temp != 0 );
	}
	
	
	public int wins1=0,wins2=0;
	
	public void displayMatrix() {
		int k=0;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++) {
				System.out.print(number[k]+ " ");
				k++;
			}
			System.out.println();
			
		}
	}
	
	
	public void checkWin(int insertPosition) 
	{
		if(
				(number[0]==number[1] && number[1]==number[2])||
				(number[3]==number[4] && number[4]==number[5])||
				(number[6]==number[7] && number[7]==number[8])||
				(number[0]==number[3] && number[3]==number[6])||
				(number[1]==number[4] && number[4]==number[7])||
				(number[2]==number[5] && number[5]==number[8])||
				(number[0]==number[4] && number[4]==number[8])||
				(number[2]==number[4] && number[4]==number[6])
		
				) {
			if(number[insertPosition]=="x") {
				System.out.println("Player1 wins the game");
				wins1++;
				p1.setStreak(wins1);
			}else {
				System.out.println("Player2 wins the game");
				wins2++;
				p2.setStreak(wins2);
			}
			temp=0;			
			
		}
	}
	
	
	public void seeWinStreak() {
		System.out.println(p1.getPlayer()+ " "+p1.getStreak());
		System.out.println(p2.getPlayer()+ " "+p2.getStreak());
		
		
	}
}

