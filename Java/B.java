interface A
{
	final int a = 10;
	void displaya();
}
interface A1 extends A
{
	final int b = 20;
	void displayb();
}
interface A2 extends A
{
	final int c = 30;
	void displayc();
}
interface A12 extends A1,A2
{
	final int d = 40;
	void displayd();
}
class B implements A12
{
	public void displaya()
		{
			System.out.println(a);
		}
		public void displayb()
		{
			System.out.println(b);
		}
		public void displayc()
		{
			System.out.println(c);
		}
		public void displayd()
		{
			System.out.println(d);
		}
	public static void main(String[] args)
	{
		
		B t = new B();
		t.displaya();
		t.displayb();
		t.displayc();
		t.displayd();
	}
}
