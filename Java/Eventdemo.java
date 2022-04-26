interface EventListner
{
	void performEvent();
}
interface MouseListner extends EventListner
{
	void mouseClicked();

	void mousePressed();

	void mouseReleased();

	void mouseMoved();

	void mouseDragged();
}
class Eventdemo
{
	public void mouseClicked()
	{
		System.out.println("mouseClicked");
	}
	public void mousePressed()
	{
		System.out.println("mousePressed");
	}
	public void mouseReleased()
	{
		System.out.println("mouseReleased");
	}
	public void mouseMoved()
	{
		System.out.println("mouseMoved");
	}
	public void mouseDragged()
	{
		System.out.println("mouseDragged");
	}
	public static void main(String[] args)
	{
		Eventdemo ed = new Eventdemo();
		ed.mouseClicked();
		ed.mousePressed();
		ed.mousePressed();
		ed.mouseReleased();
		ed.mouseMoved();
		ed.mouseDragged();	
	}
}