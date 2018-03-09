class RunThread
{
public static void main(String...s)
{
	Thread1 t1=new Thread1("T1");
	Thread2 t2=new Thread2("T2");
	Thread3 t3=new Thread3("T3");
	t1.start();
	t2.start();
	t3.start();
	//t1.run();
	//t2.run();
	//t3.run();
	for(int i=0;i<10;i++)
	{
		System.out.println(i +" "+  Thread.currentThread().getName());
		try
{
	Thread.sleep(2000);
}catch(Exception e){}
	}
	
System.out.println(Thread.currentThread().getName() + "dead");
}
}



















