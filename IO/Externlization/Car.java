import java.io.*;
class Car implements Externalizable
{
	static int age;
	String name;
	int year;
	public Car()
	{
		System.out.println("Default");
	}
	Car(String n,int y)
	{
		System.out.println("Paraametric");
		name=n;
		year=y;
		age=10;
	}
	public void writeExternal(ObjectOutput out) throws IOException
	{
		System.out.println("write External");
		out.writeObject(name);
		out.writeInt(year);
		out.writeInt(age);
		System.out.println(out);
	}
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
	{
		System.out.println("in read external");
		name=(String)in.readObject();
		 year=in.readInt();
		 age=in.readInt();
	}
	public String toString()
	{
		return(name +"\n"+ year +"\n"+  age);
	}
	
}
	