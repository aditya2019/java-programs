import java.lang.annotation.*;
class base
{
	 int x=10;
	 
	@Deprecated
	 void show()
	{
		System.out.print(x);
	}
	
} 

class Child extends base
{
	int y=30;
	//@Override
		@SuppressWarnings({"checked","deprecation"})
	public static void main(String...ss)
	{
		base c=new Child();
	
		c.show();
		//System.out.print(c.x);
		//private things can't be accessed directly
	}
}