import java.util.*;
public class Arrayaverage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]={4,4,4,4};

		double average=0;

		for(int i=0;i<a.length;i++)
		{
			average=(average+a[i]);
		}

		System.out.println("Average= "+average/a.length);
	}
}