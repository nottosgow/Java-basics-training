package day3_exercises;

import java.util.Scanner;

public class ConfirmSubString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.nextLine();
		
		System.out.println("Enter sub string to check");
		String subString = sc.nextLine();
		sc.close();
		
		System.out.println(input.contains(subString));
	}

}
