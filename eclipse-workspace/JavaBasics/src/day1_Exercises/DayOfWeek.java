package day1_Exercises;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		int input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		input = sc.nextInt();
		
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println(weekdays[input-1]);
		
		sc.close();
	}

}
