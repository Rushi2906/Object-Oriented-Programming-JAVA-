import java.util.Scanner;
public class Getdata
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a= input.nextInt(); 
		System.out.print("Enter b: ");
		int b= input.nextInt();
		int c= a+b;
		System.out.print("Addition c: "+c);
	}
}