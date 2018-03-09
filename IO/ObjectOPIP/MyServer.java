import java.io.*;
class MyServer
{
	ObjectInputStream oin;
MyServer()
{
	try
	{
oin=new ObjectInputStream(new FileInputStream("ducatIndia"));
Emp ee=(Emp)oin.readObject();
System.out.println(ee.name);
System.out.println(ee.age);
System.out.println(ee.a);
System.out.println(ee.b);
System.out.println(ee.z);
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
public static void main(String...s)
{
	new MyServer();
}	
}