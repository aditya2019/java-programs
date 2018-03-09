class InItBlock
{
	int x;
	{
		x=1000;
		System.out.print("1st InIt Block \n"+x);
	}
	InItBlock()
	{
		this(20);
		System.out.print("by default\n");
	}
	InItBlock(int x)
	{
		System.out.print(x);
	}
	{
		System.out.print("2nd InIt Block \n");
	}
public static void main(String...s)
{
	new InItBlock();
	new InItBlock(10);
	new InItBlock();
}
}