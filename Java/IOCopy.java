import java.io.*;
class IOCopy
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("IO1.txt");
			FileInputStream fis = new FileInputStream("IO.txt");
			int a = 0;
			a = fis.read();
			while(a!=-1)
			{
				fos.write(a);
				a = fis.read();
			}
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}