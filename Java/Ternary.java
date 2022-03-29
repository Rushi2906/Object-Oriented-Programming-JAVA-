import java.util.Scanner;
public class Ternary
{
	public static void main(String args[])
	{
		
		TernaryDemo obj1 = new TernaryDemo();
		int res = obj1.Setdata();
		System.out.println("Answer =  "+res);

	}
}
class TernaryDemo
{
	int a;
	int b;
	int c;
	TernaryDemo()
	{
		this.a=a;
		this.b=b;
		this.c=c; 
	}
	int Setdata()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value of A: ");
		a = sc.nextInt();
		System.out.println("Enter value of B: ");
		b = sc.nextInt();
		System.out.println("Enter value of C: ");
		c = sc.nextInt();
		int res = (a>b) ? ((a>c)?(a):(c)) : ((b>c)?(b):(c));
		return res;
	}
}