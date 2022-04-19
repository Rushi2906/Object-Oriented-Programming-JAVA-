import java.util.Scanner;
class final_6{
	final int a=5;
	
	public void printValue(){
		System.out.println(a);
	}
}
class final_6_5{
	public static void main(String[] args){
		final String s = new String("Rushi");
		System.out.println(s);
		int a=6;
		final_6 obj = new final_6();
		System.out.println(obj.a);
		obj.printValue();
	}
}
