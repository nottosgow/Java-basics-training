package day3_exercises;

import java.util.Scanner;


public class PrintCap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		String str = sc.nextLine();
		
		sc.close();
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) > 'A' && str.charAt(i) < 'Z')
				System.out.println(str.charAt(i));
		}
	}

}
