import java.io.*;
class MyFileReader
{
	public static void main(String...s)throws IOException
	{
		int i=0;
			FileInputStream fr=new FileInputStream("d:\\n8\\lalu2.txt");
		//FileInputStream fr=new FileInputStream("lalu.txt");
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}