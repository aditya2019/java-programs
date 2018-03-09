class Temp
{
	public static void main(String...sss)
	{
		System.out.print(Temp2.i);
	}	
}
class Temp1
{
	public static void main(String...sss)
	{
		System.out.print(Temp2.i);
	}
	
}
class Temp2
{
	static int i;
	static{
		try
		{
			i=System.in.read();
		}catch(Exception e)
		{
			
		}
	}
	
}