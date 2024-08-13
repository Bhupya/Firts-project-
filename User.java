package banking_system;

import java.util.Scanner;
import java.sql.Connection;


public class User {
	private Scanner scanner;
	private Connection con;
	
	public User(Connection con , Scanner scanner) {
		this.scanner=scanner;
		this.con = con;
	}
	
	public void register() {
		System.out.println("Full Name: ");
		String Full_Name=scanner.nextLine();
		
		System.out.println("Email: ");
		String Email=scanner.nextLine();
		
		System.out.println("Password: ");
		String Password=scanner.nextLine();
		
		if(user_exist(Email)) {
			System.out.println("User already exist for this email");
			return;
			
		}
	}
	public String login() {
		return null;
	}
	public boolean user_exist(String Email) {
		return false;
		
	}

}
