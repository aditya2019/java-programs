class Copycon
{
int x=90;
int y=100;
Copycon()
{
System.out.println("default");
}
static void disp(Copycon v)
{
System.out.println(v.x + " "+ v.y);
}
Copycon(int x,int y)
{
this.x=x;
this.y=y;
}
void show()
{
System.out.println(x +" "+ y);

}
Copycon(Copycon z)
{
z.x=50;
this.x=z.x;
this.y=z.y;
}
public static void main(String... f)
{

Copycon c1=new Copycon(20,40);

c1.show();

System.out.println("before c2 ");
Copycon c2=new Copycon(c1);
c2.show();
System.out.println("after c2 "+ c2.x+ " " +c1.x);
Copycon c3=new Copycon();
disp(c3);
}
}