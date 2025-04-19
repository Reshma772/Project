package org.task;

import java.util.*;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your Password Length : ");
		
		Random random = new Random();
		
		StringBuilder pass = new StringBuilder();
		
		int length = input.nextInt();
		
		String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";
		
		for(int i=0;i<length;i++) {
			
			int index=random.nextInt(character.length());
			pass.append(character.charAt(index));
			
		}
		
		System.out.println("Generted Password : " +pass.toString());
		
		

	}

}
