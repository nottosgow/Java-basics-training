package day2_exercises;

public class Fibonacci {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
//		System.out.println(num2);
		
		while (num2 <= 200) {
			int temp = num1;
			num1 = num2;
			num2 = num2 + temp;
			
			System.out.println(num1);
		}

	}

}
