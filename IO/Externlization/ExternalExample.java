import java.io.*;
	
	public class ExternalExample
	{
		public static void main(String...sss)
		{
			Car car=new Car("mitsubishi",2009);
Car newcar=null;
try
{
	FileOutputStream fout=new FileOutputStream("abc.txt");
	ObjectOutputStream so=new ObjectOutputStream(fout);
	so.writeObject(car);
	so.flush();
}catch(Exception e)
{
	System.out.print(e);
}		
try{
	
	FileInputStream fin=new FileInputStream("abc.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	newcar=(Car)oin.readObject();
	
}catch(Exception ee)
{
System.out.print(ee);	
}
System.out.print("original car = ");
System.out.print(car);
System.out.print("\n");
System.out.print("new car = ");
System.out.print(newcar);
		}
	}