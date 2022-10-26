package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import models.Quiz;
public class Quizcontroller {
	Scanner scanner = new Scanner(System.in);
	ArrayList <Quiz> quiz = new ArrayList <>();
	ArrayList <Quizquestions> quizques = new ArrayList<>();
	
	int choice;
	int count;
	
	public void arrPlayer() {
		quiz.add(new Quiz("Sujeet", 70 ));
		quiz.add(new Quiz("Ayush", 65));
		quiz.add(new Quiz("George", 55));
		quiz.add(new Quiz("Parth", 45));
		quiz.add(new Quiz("Sarvesh",35));
	}
	
	
	public void arrQuestion() {
		quizques.add(new Quizquestions("Who is prime minister of india?", "1.Narendra Modi", "2.Rahul Gandhi", "3. Sonia Gandhi",1));
		quizques.add(new Quizquestions("How many legs do cow have","1.TWO" ,  "2. FOUR","3. THREE",2));
		quizques.add(new Quizquestions("Who is president of India","1.Dr. Rajendra Prasad" , "2. Ram Nath Kovind", "3. Draupadi Murmu",3));
		quizques.add(new Quizquestions("Who is Education minister of india","1.Dr. Rajendra Prasad" ,  "2. Nirmala Sitharaman", "3. Dharmendra Pradhan",3));
		quizques.add(new Quizquestions("Who is defence minister of India","1.Dr. Rajendra Prasad",  "2. Rajnath Singh"," 3. Draupadi Murmu",2));
		quizques.add(new Quizquestions("Who is minister of Home Affairs","1.Amit Shah",  "2. Nirmala Sitharaman", "3. Draupadi Murmu",1));
		quizques.add(new Quizquestions("Who is Chief Minister of UP","1.Yogi Adityanath", "2. Nirmala Sitharaman", "3. Draupadi Murmu", 1));
		quizques.add(new Quizquestions("Who is minister of Road Transport and Highways","1.Dr. Rajendra Prasad", " 2. Nitin Gadkari", "3. Draupadi Murmu",2));
	}
	
	
	public void playGame(String Name)
	{
		for(int i=0;i<quiz.size();i++) {
			System.out.println(quizques.get(i).getQuestion());
			System.out.println(quizques.get(i).getOption1());
			System.out.println(quizques.get(i).getOption2());
			System.out.println(quizques.get(i).getOption3());
			int ans=scanner.nextInt();
			if(ans==quizques.get(i).getCorrectOption()) {
				count+=10;
			}
			else {
				count-=5;
			}
		   
		}
        
        quiz.add(new Quiz(Name,count));
        System.out.println("Your Score is " + count);
		}
	
	
	
	public void seeRankings() {
		Collections.sort(quiz, new sortRankings());
		
		for(int i=0;i<5;i++) {
			System.out.println(quiz.get(i).getName()+" "+quiz.get(i).getPoints());
		}
	}

}
