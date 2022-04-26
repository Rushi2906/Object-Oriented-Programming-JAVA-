interface Transport
{
	void deliver();
}
abstract class Animal
{
	abstract void display();
}
class Tiger extends Animal
{
	void display()
	{
		System.out.println("Tiger class");
	}
}
class Camel extends Animal implements Transport
{
	void display()
	{
		System.out.println("Camel class");
	}
	public void deliver()
	{
		System.out.println("Camel Deliver");
	}
}
class Deer extends Animal
{
	void display()
	{
		System.out.println("Deer class");
	}
}
class Donkey extends Animal implements Transport
{
	void display()
	{
		System.out.println("Donkey class");
	}
	public void deliver()
	{
		System.out.println("Donkey Deliver");
	}
}
class Animaldemo
{
	public static void main(String[] args)
	{
		Tiger t = new Tiger();
		t.display();

		Camel c = new Camel();
		c.display();
		c.deliver();

		Deer d = new Deer();
		d.display();

		Donkey don = new Donkey();
		don.display();
		don.deliver();
	}
}