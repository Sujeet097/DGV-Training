package quiz_application;
import models.Quiz;
import java.util.Scanner;

import controller.Quizcontroller;

public class QuizMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		Quizcontroller quizcontroller = new Quizcontroller();
		quizcontroller.arrQuestion();
        quizcontroller.arrPlayer();
        
        do {
        	
        	System.out.println("Enter the choice");
        	System.out.println("1. Play Game");
        	System.out.println("2.See Rankings ");
        	System.out.println("0. Exit the Game");
        	
        	
        	choice=scanner.nextInt();
            scanner.nextLine();
        	
        	switch(choice) 
        	{
        	case 1:{
        		System.out.println("Enter your Name");
        		String name = scanner.nextLine();
        		quizcontroller.playGame(name);
        		break;
        	}
        	case 2:{
        		quizcontroller.seeRankings();
        		break;
        	}
        	default:{
        		System.out.println("You have exited the game");
        	}
        	}
        	
        }while(choice != 0);
	}

}
