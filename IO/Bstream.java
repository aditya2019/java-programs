import java.io.BufferedInputStream;
import java.io.FileInputStream;
class Bstream
{
	
	public static void main(String...s)
	{
		String aa="lalu.txt";
		byte bytedata;
	try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(aa)))
	{
		//read 1 byte at a time and display it byte by byte
while((bytedata=(byte)bis.read())!=-1)
{
	System.out.print((char)bytedata);
}
	}catch(Exception e)
{
	e.printStackTrace();
}
	}
}