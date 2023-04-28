package day3_exercises;

import java.util.Scanner;

public class subStringCaseChange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter main string: ");
		String input = sc.nextLine();
		StringBuilder result = new StringBuilder(input);
		
		System.out.println("Enter sub string to capitalize");
		String str = sc.nextLine();
		
		sc.close();
		
		int index = input.indexOf(str);
		for(int i = 0; i < str.length(); i++) {
			result.setCharAt(index + i, Character.toUpperCase(str.charAt(i)));
		}
		
		System.out.println(result);
	}

}
