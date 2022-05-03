import java.io.*;
class IOCount_10_1
{
	public static void main(String[] args)
	{
		try
		{
			int charcount=0,wordcount=0,linecount=0;
			FileInputStream fis = new FileInputStream("IO.txt");
			int a=0;
			a=fis.read();
			while(a!=-1)
			{
				if(a==32)
				{
					wordcount++;
					charcount++;
				}
				else if(a==10)
				{
					linecount++;
					wordcount++;
					charcount--;
				}
				else
				{
					charcount++;
				}
				a=fis.read();
			}
			linecount++;
			wordcount++;
			System.out.println("char= "+charcount);
			System.out.println("word= "+wordcount);
			System.out.println("line= "+linecount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}