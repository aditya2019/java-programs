class RunPriority
{
public static void main(String...s)
{
Thread1 t1=new Thread1();
Thread tt1=new Thread(t1,"t1");
tt1.setPriority(Thread.MAX_PRIORITY);//max priority
Thread2 t2=new Thread2("t2");	
t2.setPriority(Thread.NORM_PRIORITY);
Thread3 t3=new Thread3("t3");	//minimum priority
t3.setPriority(Thread.MIN_PRIORITY);

t3.start();
tt1.start();
t2.start();

}	
}