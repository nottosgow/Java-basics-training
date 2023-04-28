

import java.util.Scanner;

public class InvalidCredentials extends Exception {
	
	String username;
	String password;
	
	InvalidCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String toString() {
		return "Wrong username or password";
	}
	
public static void main(String[] args) throws InvalidCredentials{
		
		Scanner sc = new Scanner(System.in);
		
		String uName;
		String pWord;
		
		System.out.println("Enter username: ");
		uName = sc.nextLine();
		
		System.out.println("Enter password: ");
		pWord = sc.nextLine();
		
		sc.close();
		
		if (uName.equals("ericsson") && pWord.equals("ericsson123")) {
			System.out.println("Welcome! You're Logged in!!");
		}
		
		else {
			throw new InvalidCredentials(uName, pWord);
		}
	}
}

