//Error

class MyHeadPhone extends Thread
{
	int stoke=5;
	synchronized void producer()
	{
		while(true)
		{
			stoke++;
			try
			{
				if(stoke>5)
				{
					wait();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Current stoke is: "+stoke);
			notifyAll();
		}
	}
	synchronized void consumer()
	{
		while(true)
		{
			stoke--;
			try
			{
				if(stoke<1)
				{
					wait();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Current stoke is: "+stoke);
			notifyAll();
		}
	}
}
class Producer extends MyHeadPhone
{
	MyHeadPhone obj = new MyHeadPhone();
	public void run()
	{
		while(true)
		{
			obj.producer();
		}
	}
}
class Consumer extends MyHeadPhone
{
	MyHeadPhone obj = new MyHeadPhone();
	public void run()
	{
		while(true)
		{
			obj.consumer();
		}
	}
}	
class ProducerConsumer 
{
	public static void main(String[] args)
	{
		MyHeadPhone obj = new MyHeadPhone();
		obj.producer();
		obj.consumer();
	}
}