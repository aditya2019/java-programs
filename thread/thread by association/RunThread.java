class RunThread
{
	public static void main(String...s)
	{
		Thread1 t1=new Thread1();
		Thread tt1=new Thread (t1,"Th1");
		tt1.start();
		Thread tt2=new Thread (t1,"Th1");
		tt2.start();
	}
}