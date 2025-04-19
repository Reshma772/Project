package org.task;

import java.util.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Number Guessing Game!");
		
		System.out.println("I'm thinking of a number between 1 and 100. \n You have 5 Attempts");
		
		
	
		int attempt= 5;
		
		Random random = new Random();
		
		int no1 = random.nextInt(100) + 1;
		
		for(int i=1;i<=attempt;i++) {
		int guess = scan.nextInt() ;
		if(guess== no1) {
			System.out.println("You are correct");
		}
		else if(guess< no1) {
			System.out.println("You are too low");
		}
		else  {
			System.out.println("You are to high");
		}
		if(i==attempt) {
			System.out.println("Out f tries! The number was :" +no1);
		}
		
		}
}
}
