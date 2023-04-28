package day3_exercises;

import java.util.Scanner;

public class ChangeCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input:");
		String input = sc.nextLine();
		StringBuilder output = new StringBuilder(input);
		sc.close();
		
		int pos = 0, start = 0;
		
		while (start < input.lastIndexOf(" ")) {
			
			output.setCharAt(pos, Character.toUpperCase(input.charAt(pos)));
			
			pos = 1 + input.indexOf(" ", start);
			start = pos;
		}
		
		System.out.println(output);
	}

}
