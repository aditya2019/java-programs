class RunThread1
{
	public static void main(String...s)
	{
		Thread1 t1=new Thread1();
		t1.x=50;
		Thread tt1=new Thread (t1,"Th1");
		tt1.start();
		Thread1 t2=new Thread1();
		t2.x=100;
		Thread tt2=new Thread (t2,"Th2");
		tt2.start();
		Thread1 t3=new Thread1();
		t3.x=1000;
		Thread tt3=new Thread (t3,"Th3");
		tt3.start();
		Thread1 t4=new Thread1();
		t4.x=10000;
		Thread tt4=new Thread (t2,"Th4");
		tt4.start();
		for(int i=0;i<=5;i++){
		System.out.println(Thread.currentThread().getName());
		}try
		{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			
		}
		System.out.println(Thread.currentThread().getName());
	}
}