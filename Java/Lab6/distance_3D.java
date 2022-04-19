import java.util.Scanner;
class MyPoint{
	double x;
	double y;
	double z;
	public MyPoint(){
		x=0;
		y=0;
		z=0;
	}
	public MyPoint(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double distance(MyPoint mp){
		double dist = Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2)+Math.pow(this.z-mp.z,2));
		return dist;
	}
	public double distance(double x,double y,double z){
		double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
		return dist;
	}
}
public class distance_3D{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x-----------");
		double x = sc.nextDouble();
		System.out.println("Enter y-----------");
		double y = sc.nextDouble();
		System.out.println("Enter z-----------");
		double z = sc.nextDouble();

		MyPoint mp1 = new MyPoint();
		MyPoint mp2 = new MyPoint(x,y,z);
		System.out.println(mp1.distance(mp2));
		
	}
}