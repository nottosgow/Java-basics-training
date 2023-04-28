package day3_exercises;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String input = sc.nextLine();
		
		System.out.println("Enter position:");
		int pos = sc.nextInt();
		
		System.out.println("Character at that position is: " + input.charAt(pos));
		
		sc.close();
	}

}
