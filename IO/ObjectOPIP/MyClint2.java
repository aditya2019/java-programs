import java.io.*;
class MyClint2
{
	ObjectOutputStream os;
	MyClint2()
	{
		try
		{
			
			 os=new ObjectOutputStream(new FileOutputStream("ducatIndia"));
			 os.writeObject(new Emp("Rahul",22,10,20,30));
			 os.writeObject(new Emp("Rahul Yadav",23,100,200,300));//more than 1 obj can be serialized
		os.flush();
		}catch(Exception e)
		{System.out.println(e);} 
		
		
	}
	public static void main(String...s)
	{
		new MyClint2();
	}
}
	
