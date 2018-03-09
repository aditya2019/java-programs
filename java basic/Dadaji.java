import  java.lang.annotation.*;
class Dadaji
{
	void show1()
	{
		System.out.println("dada");
	}
	
}
class Base extends Dadaji
{
	
	void show1()
	{
		System.out.println("base");
	}
	
}
class child123 extends Base
{
	
	//@Override 
	void show()
	{
		System.out.println("child");
		((Dadaji)this).show1();
	}
	public static void main(String...s)
	{
		child123 c123=new child123();
		c123.show();
	}
	
}