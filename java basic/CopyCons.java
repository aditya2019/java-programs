class CopyCons
{
int x,y;
CopyCons(int x,int y)
{
	this.x=x;
	this.y=y;
}
CopyCons(CopyCons z)
{
x=z.x;
y=z.y;	
z.x=1;

}
void show()
{
	System.out.println(x+"  "+y);
}
public static void main(String...s)
{
	CopyCons c=new CopyCons(10,20);
	c.show();
	CopyCons c1=new CopyCons(c);
	c1.x=002;
	c1.y=003;
	c1.show();
	c.show();
}
}