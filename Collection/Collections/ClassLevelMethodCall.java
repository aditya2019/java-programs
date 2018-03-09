class ClassLevelMethodCall
{
	int x=get();
	ClassLevelMethodCall()
	{
		System.out.print("now cons run " +x);
	}
	int get()
	{
		System.out.println(x);
		return 10;
	}
	public static void main(String...s)
	{
		new ClassLevelMethodCall();
	}
}