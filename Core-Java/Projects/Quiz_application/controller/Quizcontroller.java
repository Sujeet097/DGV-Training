package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import models.Quiz;
public class Quizcontroller {
	Scanner scanner = new Scanner(System.in);
	ArrayList <Quiz> quiz = new ArrayList <>();
	int choice;
	int count;
	
	public void arrPlayer() {
		quiz.add(new Quiz("Sujeet", 70 ));
		quiz.add(new Quiz("Ayush", 65));
		quiz.add(new Quiz("George", 55));
		quiz.add(new Quiz("Parth", 45));
		quiz.add(new Quiz("Sarvesh",35));
	}
	
	
	public void playGame(String Name)
	{
		count=0;
		//1
		System.out.println("Who is prime minister of india");
		System.out.println("1.Narendra Modi 2.Rahul Gandhi 3. Sonia Gandhi 4. Nitish Kumar");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score is " + count);
			break;
			
		}
		case 2:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 4:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		}
		
		//2
		System.out.println("How many legs do cow have");
		System.out.println("1.TWO  2. FOUR");
        choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		}
		
		//3
		System.out.println("Is JAVA independent language");
		System.out.println("1.NO  2. YES");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		}
		 
        
        //4
        System.out.println("Who is president of India");
		System.out.println("1.Dr. Rajendra Prasad  2. Ram Nath Kovind 3. Draupadi Murmu");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		}
        
		
        //5
        System.out.println("Who is minister of Finance");
		System.out.println("1.Dr. Rajendra Prasad  2. Nirmala Sitharaman 3. Draupadi Murmu");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		}
        
        //6
        System.out.println("Who is Education minister of india");
		System.out.println("1.Dr. Rajendra Prasad  2. Nirmala Sitharaman 3. Dharmendra Pradhan");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		}
		
        //7
        System.out.println("Who is defence minister of India");
		System.out.println("1.Dr. Rajendra Prasad  2. Rajnath Singh 3. Draupadi Murmu");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		}
		
        
        
        //8
        System.out.println("Who is minister of Home Affairs");
		System.out.println("1.Amit Shah  2. Nirmala Sitharaman 3. Draupadi Murmu");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		}
        
        //9
        System.out.println("Who is minister of Road Transport and Highways");
		System.out.println("1.Dr. Rajendra Prasad  2. Nitin Gadkari 3. Draupadi Murmu");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		}
        
        
        //10
        System.out.println("Who is Chief Minister of UP");
		System.out.println("1.Dr. Rajendra Prasad  2. Nirmala Sitharaman 3. Draupadi Murmu 4. Yogi Adityanath");
        choice=scanner.nextInt();
        
        switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score is " + count);
			break;
		}
		case 4:{
			count+=10;
			System.out.println("Score is " + count);
			break;
		}
    }
        
        quiz.add(new Quiz(Name,count));
		}
	
	
	
	public void seeRankings() {
		Collections.sort(quiz, new sortRankings());
		
		for(int i=0;i<5;i++) {
			System.out.println(quiz.get(i).getName()+" "+quiz.get(i).getPoints());
		}
	}

}
