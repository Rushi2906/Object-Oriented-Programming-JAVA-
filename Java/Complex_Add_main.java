import java.util.Scanner;

class Complex_Add
{
	int real;
	int image;

	public Complex_Add(int r,int i)
	{
		this.real = r;
		this.image = i;
	}

	public void showC()
	{
		System.out.println(this.real+"+i"+this.image);
	}

	public static Complex_Add add(Complex_Add n1,Complex_Add n2)
	{
		Complex_Add res = new Complex_Add(0,0);

		res.real  = n1.real + n2.real;
		res.image = n1.image + n2.image;

		return res;
	}
}

class Complex_Add_main
{
	public static void main(String [] args)
	{
		Complex_Add_main n1 = new Complex_Add(4,5);
		Complex_Add_main n2 = new Complex_Add(6,7);

		System.out.println("Complex Number 1 is " + n1.showC());
		System.out.println("Complex Number 2 is " + n2.showC());

		Complex_Add res = add(n1,n2);

		System.out.println("Addition is: ");
		res.showC();
	}
}