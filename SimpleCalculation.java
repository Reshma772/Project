package org.task;

import java.util.*;

public class SimpleCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		
		int fnumber = input.nextInt();
		
        System.out.println("Enter the Second number");
		
		int snumber = input.nextInt();
		
		System.out.println("Enter an Symbol to calculate  (+ - / * : ) : ");
		String operator = input.next();
		
		switch(operator) {
		
		case "*":
			System.out.println("The multiplication of "+fnumber + " X " + snumber+ " : "+(fnumber*snumber));
			break;
			
		case "+":
			System.out.println("The addition of "+fnumber + "+" + snumber + " : "+(fnumber+snumber));
			
		case "/":
			System.out.println("The division of " +fnumber + "/" +snumber +":" +(fnumber/snumber));
			
		case "-":
			System.out.println("The module of " +fnumber + "-" + snumber +":" +(fnumber - snumber));
			
			
			
			
			
			
		}
		
		
			
	}

}
