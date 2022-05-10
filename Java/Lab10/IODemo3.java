import java.io.*;
import java.util.Scanner;

public class IODemo3
{
	public static void main(String[] args) throws Exception
	{
		int count=0,i;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit  you want to search: ");
		ch=sc.next().charAt(0);
		File f= new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(f));

		while((i=br.read())!=-1)
		{
			if(i==ch)
			{
				count++;
			}
		}
		System.out.println("Count= "+count);
	}
}