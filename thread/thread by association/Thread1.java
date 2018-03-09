class Thread1 implements Runnable
{
	int x=10;
	public void run()
	{
		for(int i=0;i<=10;i++){
		System.out.println(Thread.currentThread().getName()+ "==" + x);
		}try
		{
			Thread.sleep(5000);
		}catch(Exception e)
		{
			
		}
		
		System.out.println(Thread.currentThread().getName());
	}
}