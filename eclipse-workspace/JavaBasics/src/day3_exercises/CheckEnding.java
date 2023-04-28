package day3_exercises;

import java.util.Scanner;

public class CheckEnding {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String to check");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter second string:");
		String str2 = scanner.nextLine();
		scanner.close();
		
		System.out.println(str1.endsWith(str2));
	}

}
