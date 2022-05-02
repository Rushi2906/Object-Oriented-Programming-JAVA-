class Thread1 extends Thread
{
	public Thread1(){
		start();
	}
	public void run(){
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd number : "+i);
			}
		}
	}

}
class Thread2 extends Thread
{
	public Thread2(){
		start();
	}
	public void run(){
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number : "+i);
			}
		}
	}

}
class Multithreading_9_2{
	public static void main(String[] args){
    	Thread1 obj1=new Thread1();
    	Thread2 obj2=new Thread2();
	}
}

