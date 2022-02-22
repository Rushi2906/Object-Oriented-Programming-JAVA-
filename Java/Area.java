import java.util.Scanner;
public class Area{
	float circlearea(int r)
	{
		float ans=(float)3.14*r*r;
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r = input.nextInt();
		Area obj1 = new Area();
		float area = obj1.circlearea(r);
		System.out.println("Area of circle= "+area);
	}
}