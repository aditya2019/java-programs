import java.io.*;
class MyClint1 
{
	ObjectOutputStream os;
	MyClint1()
	{
		try
		{
			
			 os=new ObjectOutputStream(new FileOutputStream("ducatIndia"));
			 os.writeObject(new Emp("Rahul",22,10,20,30));
		os.flush();
		}catch(Exception e)
		{System.out.println(e);} 
		
		
	}
	public static void main(String...s)
	{
		new MyClint1();
	}
}
	
