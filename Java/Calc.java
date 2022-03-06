import java.io.*;
import java.util.*;
public class Calc{
	public static void main(String[] args){
		System.out.println("Enter number n------------");
		Scanner s = new Scanner(System.in);

		System.out.print("Enter n1=");
		int n1 = s.nextInt();

		System.out.print("Enter n2=");
		int n2 = s.nextInt();

		System.out.print("op= ");
		String s1 = s.next();
		char op = s1.charAt(0);

		System.out.println("Output------------");
		if(op=='+')
		{
			System.out.print("Sum=");
			System.out.println(n1+n2);
		}
		else if(op=='-')
		{
			System.out.print("Sub=");
			System.out.println(n1-n2);
		}
		else if(op=='*')
		{
			System.out.print("Mul=");
			System.out.println(n1*n2);
		}
		else if(op=='/')
		{
			System.out.print("Div=");
			System.out.println(n1/n2);
		}
		else if(op=='%')
		{
			System.out.print("Rem=");
			System.out.println(n1%n2);
		}
		else
		{
			System.out.println("Invalid Input.");
		}
	}
}