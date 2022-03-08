import java.util.Scanner;
public class Halfstring{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int l = s1.length();

		System.out.println("Length of String= "+l);

		int hs=l/2;

		System.out.print("New String: ");

		for(int i=hs;i<l;i++)
		{
			char ch=s1.charAt(i);
			System.out.print(ch);
		}
	}
}