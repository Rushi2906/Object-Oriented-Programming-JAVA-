import java.util.Scanner;
public class Conversation{
	float ftoc(float f){
		float ans = (f-32f)*(5f/9f);
		return ans;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Temperature in Feranhit: ");
		float f = input.nextFloat();
		
		Conversation obj1 = new Conversation();
		float ans=obj1.ftoc(f);
		
		System.out.println("Celcius= "+ans);
	}
	
}