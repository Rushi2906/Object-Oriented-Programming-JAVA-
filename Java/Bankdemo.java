	import java.util.Scanner;

class Bank_Account{

	int accountno;
	String username;
	String email;
	String accounttype;
	double accountbalance;

		void getAccountDetails()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter accountno: ");
			accountno = sc.nextInt();
			System.out.println("Enter username: ");
			username = sc.next();
			System.out.println("Enter email: ");
			email = sc.next();
			System.out.println("Enter accounttype: ");
			accounttype = sc.next();
			System.out.println("Enter accountbalance: ");
			accountbalance = sc.nextDouble();
		}

		void displayAccountDetails()
		{
			System.out.println(accountno);
			System.out.println(username);
			System.out.println(email);
			System.out.println(accounttype);
			System.out.println(accountbalance);
		}
	
}

class Bankdemo{
	public static void main(String args[]){

		Bank_Account obj1 = new Bank_Account();
		obj1.getAccountDetails();
		obj1.displayAccountDetails();

	}
}