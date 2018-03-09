import java.io.*;
class Emp extends Base implements Serializable
{
	private final static long serialVersionUID=1L;
	transient int a;
	static int b=10;/*here data will come back due to loading of class in memory not because of deserialized object
	but via constructor it can't be*/
	String name;
	int age;
	int salary;//on adding new dm compiler will change the  serialVersionUID hence saved object can't be reterived
	// so we must put out serialVersionUID
	//Base base=new Base(); //because of this it will throw NotSerialException
	Emp(String name,int age,int a,int b,int z)
	{
		this.name=name;
		this.age=age;
		this.a=a;
		this.b=b;
		this.z=z;//z will not save because Base has not implemented serializable
	} 

}