class XY
{
	int x;
	int y;
	public void multiplication()
	{
		try
		{
			int ans=x*y;
		}
		catch(Exception e)
		{

		}
	}
	

}
class XYException
{
	public static void main(String[] args)
	{
		XY a = new XY();
		a.multiplication();
		System.out.println("X="+args[0]+"Y="+args[1]);
	}
}