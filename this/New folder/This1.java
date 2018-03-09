class This1
{
	int x=10;
	public void show(int y)
	{
		System.out.print(x);
		System.out.print(this.x);
		
	}
	public static void main(String...s)
	{
		This1 t=new This1();
		t.show(20);
		
	}
	
}
/*if we put this in instance fun then it will directly check at class level variable at compile ,
if not found throw compile time error,
if we do not put this explicitly then compiler check for variable in stack frame first if not found then only
go to class level for that variable
*/