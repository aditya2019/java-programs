class Const
{
Const()
{
System.out.println(this);
}
public static void main(String... s)
{
Const e=new Const();
System.out.println("main "+e);
}
}