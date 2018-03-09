class Postpre
{
	public static void main(String...s)
	{
		int i=0;
		while(i<10)
		{
			i=increment(i);
			System.out.println(i);
			
		}
		
	}
	
		static int increment(int i)
		{
			return ++i;
		}
}