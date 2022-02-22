import java.util.Scanner;
public class Greaterno{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a= input.nextInt(); 
		System.out.print("Enter b: ");
		int b= input.nextInt(); 
		System.out.print("Enter c: ");
		int c= input.nextInt(); 
		if(a>b && a>c)
		{
		System.out.print("max= "+a);
		}
		else if(b>a && b>c)
		{
		System.out.print("max= "+b);
		}
		else
		{
		System.out.print("max= "+c);
		}
		
	}
}