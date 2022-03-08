import java.util.*;
public class Consvowel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int l = s1.length();
		String s2 = s1.toLowerCase();

		int vowel=0,cons=0;

		for(int i=0;i<l;i++)
		{
			char ch = s2.charAt(i);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowel++;
			}
			else
			{
				cons++;
			}
		}

		System.out.println("Total No of Vowel= "+vowel);
		System.out.println("Total No of Consonent= "+cons);

	}
}