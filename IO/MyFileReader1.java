import java.io.*;
class MyFileReader1
{
	public static void main(String...s)throws IOException
	{
		FileInputStream fr=new FileInputStream("d:\\n8\\lalu2.txt");
		byte b[]=new byte[fr.available()];
        fr.read(b);	
		
        System.out.println(new String(b));		
}}