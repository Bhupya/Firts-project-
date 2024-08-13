package banking_system;

import java.util.Scanner;
import java.security.PublicKey;
import java.sql.*;

public class BankingApp {
	
	private static final String url = "jdbc:mysql://localhost:3306/bank";
	private static final String username = "root";
	private static final String password = "root";
	
	public static void main(String args[])throws Exception {
		Scanner scanner=new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection(url,username,password);
		
		User user=new User(c , scanner);
		Accounts accounts=new Accounts(c , scanner);
		BankingManager bankingmanager = new BankingManager(c , scanner);
		
		String email;
		long accNo;
		while(true) {
			System.out.println("******** WELCOME TO BANKING SYSTEM ********");
			System.out.println();
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.println("Enter Your Choise : ");
			int choise = scanner.nextInt();
			switch(choise) {
			case 1 :
				break;
				
			case 2:
				email = user.login();
				if(email != null)
				{
					System.out.println();
					System.out.println("User Logged In!");
					if(!accounts.account_exist(email)) {
						System.out.println();
						System.out.println("1. Open New Bank Account");
						System.out.println("2. Exit");
						if(scanner.nextInt() == 1) {
							accNo = accounts.open_account(email);
							System.out.println("Account Created Successfully");
							System.out.println("Your Account Number Is "+accNo);
						}else {
							break;
						}
					}
					accNo  = accounts.getAccount_Number(email);
					int choise2 = 0;
					while(choise != 5) {
						System.out.println();
						System.out.println("1. Debit Money");
						System.out.println("2. Credit Money");
						System.out.println("3. Transfer Money");
						System.out.println("4. Check Balance");
						System.out.println("5. Exit");
					}
				}
				break;
				
			case 3:
				System.exit(0);
				break;
				
			default : 
				System.out.println("Invalid Choise ...!");
			}
		}
	}

}
