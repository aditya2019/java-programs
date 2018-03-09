class child1 extends base1
{
	int x=10;
	
	void show()
	{
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(((dadaji)this).x);
	}
	public static void main(String...s)
	{
		child1 c=new child1();
		
		//c.show1();
		c.show();
	}
}
class base1 extends dadaji
{
int x=20;
	void show1()
	{
	System.out.println(x);
}
	
}
class dadaji
{
	int x=30;
	void show()
	{
	System.out.println(x);
}}