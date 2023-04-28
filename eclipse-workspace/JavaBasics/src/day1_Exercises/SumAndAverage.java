package day1_Exercises;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for(int i=0; i<5; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		
		for(int num: nums) {
			sum += num;
		}
		
		System.out.println("Sum= " + sum);
		System.out.println("Avg= " + (float) sum / 5);
	}

}
