import java.io.*;
class Demo
{
	byte b[]={1,2,3,4};
	public static void main(String...s)
	{
		try{
		FileOutputStream fo=new FileOutputStream("abc.txt");
		//FileInputStream f= new FileInputStream("abc.txt");
		f.write(byte[] b);
		}catch(Exception e)
		{
		System.out.println(e);
		}
	
	}
}