package day1_Exercises;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		System.out.println("Enter third number");
		num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the greatest");
		}
		
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the greatest");
		}
		
		else {
			System.out.println(num3 + " is the greatest");
		}
		
		sc.close();
	}

}
