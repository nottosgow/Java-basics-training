package day3_exercises;

import java.util.Scanner;

public class specificCap {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String string = sc.nextLine();
		StringBuilder res = new StringBuilder(string);
		sc.close();
		
		int firstPos = -1;
		for (int i = 0; i < 2; i++) {
			firstPos = string.indexOf('l', firstPos + 1);
			System.out.println("/////// inside for, + " + firstPos);
		}
		
		System.out.println("////////// " + firstPos);
		res.setCharAt(firstPos, Character.toUpperCase(string.charAt(firstPos)));
		
		System.out.println(res);
	}

}
