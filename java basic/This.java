class This
{
	int x;
This(int y)
{
	x=y;
	System.out.print(this.x);
}	
void show(This this, int x)
{
	this.x=x;
	System.out.print(x);
}
	public static void main(String...s)
	{
		new This(20).show(10);
	}
}