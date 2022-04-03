//Lab_5_4 

class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;

	public Bank_Account(int accountNo,String userName,String email,String accountType,double accountBalance)
	{
		this.accountNo = accountNo;
		this.userName = userName;
		this.email = email;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public String getAccountDetail(){
		return accountNo+"-"+userName+"-"+email+"-"+accountType+"-"+accountBalance;
	}

	public void displayAccountDetail(){
		System.out.println(accountNo+"-"+userName+"-"+email+"-"+accountType+"-"+accountBalance);
	}
}
public class Bankdemo_5_4{
	public static void main(String[] args){
		Bank_Account ba = new Bank_Account(123,"Rushi","rushi.com","saving",30000);
		ba.displayAccountDetail();

		String ans = ba.getAccountDetail();
		System.out.println(ans);
	}
}