import java.io.*;
class MyFileReader
{
	public static void main(String...sss)throws IOException
	{
     FileInputStream fin=new FileInputStream("abcd.txt");
     int i=0;
while((i=fin.read())!=-1)
{
	System.out.print((char)i);
}
fin.close();	
	}
	
}