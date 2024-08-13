package banking_system;

import java.util.Scanner;
import java.sql.Connection;

public class BankingManager {
	private Scanner scanner;
	private Connection con;

	public BankingManager(Connection con , Scanner scanner) {
		 this.scanner=scanner;
		 this.con = con;
	 }
	
	public void credit_money() {
		System.out.println("Enter Amount: ");
		double amount=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Security Pin: ");
		String security_pin=scanner.nextLine();
	}
	
	public void debit_money(long account_number) {
		System.out.println("Enter Amount: ");
		double amount=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Security Pin: ");
		String security_pin=scanner.nextLine();
	}
	
	public void transfer_money(long sender_account_number) {
		scanner.nextLine();
		System.out.println("Enter Receiver Account Number: ");
		long receiver_account_number=scanner.nextLong();
		System.out.println("Enter Amount: ");
		double amount=scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Security Pin: ");
		String security_pin=scanner.nextLine();
	}

}
