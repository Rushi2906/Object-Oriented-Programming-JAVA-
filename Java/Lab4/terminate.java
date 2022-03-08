import java.util.Scanner;
public class terminate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int l=s1.length();
		

		for(int i=0;i<l;i++)
		{
			int ch=s1.charAt(i);	

			if(ch>=65 && ch<=90)
			{
				System.out.println("Programm Terminated.");
				break;
			}
			else
			{
				System.out.println("please enter your first letter to be capital.");
				break;
			}
		}

	}
}