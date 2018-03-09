class Constructor
{
Constructor(int x)
{
System.out.println("Value of x "+x);
}
/*Constructor()
{
this(10);
System.out.println("default constructor");
}*/
void show()
{
System.out.println("show method");
}
public static void main(String... s)
{
Constructor c1=new Constructor(10);
c1.show();
}
}