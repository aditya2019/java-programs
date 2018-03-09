import java.io.*;
class MyServer2
{
	ObjectInputStream oin;
MyServer2()
{
	try
	{
oin=new ObjectInputStream(new FileInputStream("ducatIndia"));
Emp ee=(Emp)oin.readObject();
Emp ee1=(Emp)oin.readObject();
System.out.println(ee.name);
System.out.println(ee1.name);
System.out.println(ee.age);
System.out.println(ee1.age);
System.out.println(ee.a);
System.out.println(ee1.a);
System.out.println(ee.b);
System.out.println(ee1.b);
System.out.println(ee.z);
System.out.println(ee1.z);
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
public static void main(String...s)
{
	new MyServer2();
}	
}