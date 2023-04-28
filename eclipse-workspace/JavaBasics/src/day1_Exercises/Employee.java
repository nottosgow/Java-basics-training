package day1_Exercises;

import java.util.Scanner;

public class Employee {
	
	int ID;
	String Name;
	int Salary;
	String Address;
	long Contact;
	char Gender;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.println("Enter employee ID: ");
		e.ID = sc.nextInt();
		
		System.out.println("Enter employee name: ");
		e.Name = sc.nextLine();
		
		System.out.println("Enter employee salary: ");
		e.Salary = sc.nextInt();
		
		System.out.println("Enter employee address: ");
		e.Address = sc.nextLine();
		
		System.out.println("Enter employee contact number: ");
		e.Contact = sc.nextLong();
		
		System.out.println("Enter employee gender: ");
		e.Gender = sc.next().charAt(0);
		
		sc.close();

	}

}
