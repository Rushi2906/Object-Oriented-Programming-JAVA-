import java.io.*;
import java.util.*;
public class Calc_switch
{
	public static void main(String args[])
	{
		System.out.println("Enter Number----------------------");
		Scanner s=new Scanner(System.in);
		
		System.out.print("n1=");
		int n1=s.nextInt();

		System.out.print("n2=");
		int n2=s.nextInt();

		System.out.print("op=");
		String s1 = s.next();
		char op = s1.charAt(0);

		switch (op)
		{
			case '+':
				System.out.print("Sum=");
				System.out.println(n1+n2);
				break;

			case '-':
				System.out.print("Sub=");
				System.out.println(n1-n2);
				break;

			case '*':
				System.out.print("Mul=");
				System.out.println(n1*n2);
				break;

			case '/':
				System.out.print("Div=");
				System.out.println(n1/n2);
				break;

			case '%':
				System.out.print("Mod=");
				System.out.println(n1%n2);
				break;

			default:
				System.out.println("invalid input-------------------------");
				break;
		}
	}
}