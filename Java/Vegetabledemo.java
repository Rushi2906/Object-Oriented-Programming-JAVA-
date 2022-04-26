abstract class vegetable
{
	String color;
	vegetable(String color)
	{
		this.color=color;
	}
	abstract void display();
}
class Potato extends vegetable
{
	super.color="creame";
	public void display()
	{
			System.out.println("Color of Potato= "+color);
	}
}
class Brinjal extends vegetable
{
	super.color="purple";
	public void display()
	{
		System.out.println("Color of Brinjal= "+color);
	}
}
class Tomato extends vegetable
{
	super.color="red;
	public void display()
	{
		System.out.println("Color of Tomato= "+color);
	}
}
public class Vegetabledemo
{
	public static void main(String[] args)
	{
		Potato p = new Potato();
		p.display("Creame");
		Brinjal b = new Brinjal();
		b.display("Purple");
		Tomato t = new Tomato();
		t.display("Red");
	}
}