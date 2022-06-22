import java.util.Scanner;
public class Angle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hour: ");
		int hour = sc.nextInt();
		System.out.println("Enter minit: ");
		int minit = sc.nextInt();

		if(hour==12)
			hour=0;
		if(minit==60)
			minit=0;

		int hourangle;
		int minitangle;

		hourangle= (hour * 30)  + (minit / 2);
		minitangle= (minit * 6);

		int angle;
		angle=Math.abs(hourangle-minitangle);

		System.out.println("Angle is: "+angle);
	}
}