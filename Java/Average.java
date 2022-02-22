public class Average{
	public static void main(String[] args){
		int[] a = {2,5,7,8};
		int sum=0;
		float ans;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		ans=(float)sum/a.length;
		System.out.println("Average= "+ans);
	}
}