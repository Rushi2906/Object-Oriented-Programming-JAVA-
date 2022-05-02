import java.util.Scanner;
class Account extends Exception
{
	String str;
	public Account(String str)
	{
		this.str=str;
	}
	public void display()
	{
		System.out.println(this.str);
	}
}
public class AccountDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0,flag=0;
		String str;
		System.out.println("Enter withdraw amount: ");
		int amt=sc.nextInt();
		int n=Integer.parseInt(args[0]);
		str="";
		while(amt>5000)
		{
			try{
				n=n-amt;
				if(n<5000)
				{
					flag=1;
				}
				if(flag==1)
				{
					throw new Account(str);
				}
			}
		}
		catch(Account e)
		{
			System.out.println("Insufficien balance for amount: "+amt);
			e.display();
		}
		if(flag==1){
			n=n+amt;
			System.out.println("amount= "+n);
		}
		else
		{
			System.out.println("amount= "+n);
		}
	}
}