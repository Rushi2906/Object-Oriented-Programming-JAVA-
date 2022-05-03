class Gm implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Morning!");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){

			}
		}
	}
}
class Ga implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Afternoon!");
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){

			}
		}
	}
}
class Messagedemo{
	public static void main(String[] args){
		Gm obj1 = new Gm();
		Ga obj2 = new Ga();
		Thread t1=new Thread(obj1);
		t1.start();
		Thread t2=new Thread(obj2);
		t2.start();
	}
}