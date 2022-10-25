package controller;

import java.util.Comparator;

import models.Quiz;

public class sortRankings implements Comparator<Quiz>{
	
	public int compare(Quiz quiz1,Quiz quiz2) {
		return quiz2.getPoints()-quiz1.getPoints();
	}

}
