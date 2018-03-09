class Thread3 extends Thread
{
Thread3(String s)
{
	super(s);
}
public void run()
{
for(int i=0;i<7;i++)
{
	System.out.println( i+ "" +getName());
	try
{
	Thread.sleep(2000);
}catch(Exception e){}

}	
System.out.println(getName() + "dead");
}
}