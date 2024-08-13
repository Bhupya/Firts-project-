package banking_system;

import java.sql.Connection;
import java.util.Scanner;

public class Accounts {
	private Scanner scanner;
	private Connection con;
	
	public Accounts(Connection conn ,Scanner scanner) {
		this.scanner=scanner;
		this.con = con;
	}

	public long open_account(String Email) {
		System.out.println("Enter Full Name: ");
		String Full_Name=scanner.nextLine();
		
		System.out.println("Enter Initial Amount:: ");
		double balance=scanner.nextDouble();
		
		scanner.nextLine();
		System.out.println("Enter Security Pin: ");
		String security_pin=scanner.nextLine();
		return 0;
	}
	public long getAccount_Number(String Email) {
		return 0;
	}
	private long generateAccountNumber() {
		return 0;
	}
	public boolean account_exist(String email) {
		return false;
	}
}
