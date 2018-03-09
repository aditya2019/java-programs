class Emp extends Thread
{
	
	public void run()
	{
		System.out.println("thread");
	}
public static void main(String...s)
{
	Emp e=new Emp();
	System.out.println(e.currentThread());

	e.start();
}

}