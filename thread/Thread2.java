class Thread2 extends Thread
{
Thread2(String s)
{
	super(s);
}
public void run()
{
for(int i=0;i<6;i++)
{
	System.out.println(i+ "" +getName());
	try
{
	Thread.sleep(2000);
}catch(Exception e){}

}	
System.out.println(getName() + "dead");
}
}