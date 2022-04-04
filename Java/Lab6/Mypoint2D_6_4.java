// Lab_6_4

class MyPoint{
	double x;
	double y;
	public MyPoint(){
		x = 0;
		y = 0;
	}
	public MyPoint(double x,double y){
		this.x = x;
		this.y = y;
	}
	public double distance(MyPoint mp){
		double dist = Math.sqrt(Math.pow(this.x-mp.x,2)+Math.pow(this.y-mp.y,2));
		return dist;
	}
	public double distance(double x,double y){
		double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
		return dist;
	}
}

public class Mypoint2D_6_4{
	public static void main(String[] args){
		MyPoint mp1 = new MyPoint();
		MyPoint mp2 = new MyPoint(1,1);
		System.out.println(mp1.distance(mp2));
		System.out.println(mp1.distance(1,0));
	}
}
