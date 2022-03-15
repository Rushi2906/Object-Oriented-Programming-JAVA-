import java.util.Scanner;
class Circle{
	double r;
	double areaofcircle(){
		return 3.14*r*r;
	}
}
class Circledemo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		Circle c1 = new Circle();
		c1.r = input.nextDouble();
		double area = c1.areaofcircle();
		System.out.println("Area= "+area);
	}
}
