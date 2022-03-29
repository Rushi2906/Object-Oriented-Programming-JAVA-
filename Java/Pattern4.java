import java.util.Scanner;
public class Pattern4{
	public static void main(String[] args){
		System.out.println("Enter number = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=0;i<n;i++){
			for(int k=n-1;k>i;k--){
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}