//Lab_5_3 count vowel till user enter 'quit'

import java.util.Scanner;
class NoofVowel{
	int totalvowelcount=0;
	public NoofVowel(){
		Scanner sc = new Scanner(System.in);
		String temp;
		do{
			System.out.println("Enter Sentence :");
			temp = sc.nextLine();
			for(int i=0;i<temp.length();i++)
			{
				if(temp.charAt(i)=='a' || temp.charAt(i)=='e' || temp.charAt(i)=='i' || temp.charAt(i)=='o' || temp.charAt(i)=='u')
				{
					totalvowelcount++;
				}
			}
		}while(!temp.equals("quit"));
		System.out.println(totalvowelcount-2);
	}
} 
public class Vowel_5_3{
	public static void main(String[] args){
		NoofVowel n = new NoofVowel();
	}
}

