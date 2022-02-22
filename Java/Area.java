import java.util.Scanner;
public class Area{
	static float circlearea(int r)
	{
		float ans=(float)3.14*r*r;
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = input.nextInt();
		float area=circlearea(r);
		System.out.println("Area of circle= "+area);
	}
}