package day1_Exercises;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		if (num > 0) System.out.println("Number is positive");
		else if (num < 0) System.out.println("Number is negative");
		else System.out.println("Number is 0");

		sc.close();
	}

}
