class Odd implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2!=0)
			{
				System.out.println("Odd: "+i);
			}
			try{
				Thread.sleep(100);
			}
			catch(Exception e){

			}
		}
	}
}
class Even implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2==0)
			{
				System.out.println("Even:"+i);
			}
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				
			}
		}
	}
}
class Odd_Even{
	public static void main(String[] args){
		Odd obj1=new Odd();
		Even obj2=new Even();
		Thread t1=new Thread(obj1);
		t1.start();
		Thread t2=new Thread(obj2);
		t2.start();
	}
}