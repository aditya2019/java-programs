import java.io.*;
class Car1 implements Externalizable 
{
	 static int age;
	 String name;
	 int year;
	 public Car1()
	 {
		 System.out.println("in default constructor");
	 }
	 Car1(String n, int y)
	 {
		 System.out.println("in parametric constructor");
		 name=n;
		 year=y;
		 age=20;
	 }
	 public void writeExternal(ObjectOutput o) throws IOException
	 {
		  System.out.println("in write method  " + o);
		 o.writeObject(name);
		 o.writeInt(age);
		 o.writeInt(year);
	 }
	 public void readExternal(ObjectInput i) throws IOException, ClassNotFoundException
	 {
		 System.out.println("in read method  " + i);
		 name=(String)i.readObject();
		 age=i.readInt();
		 year=i.readInt();
	 }
	 public String toString()
	 {
		 return("name = "+ name + "\n" +"year = "+ year + "\n" + "age = " + age);
	 }
}