class Outer
{
int x=10;
static int y=30;


void disp(){
class Inner
{
//int x = 77;
 void show(){
//System.out.println(Outer.this.x);
System.out.println(x);
System.out.println(x);
System.out.println(y);
}
}
Inner t =new Inner();
Outer p=(Outer)t;
t.show();
}



public static void main(String... k)
{
//System.out.println("main method "+Outer.y);
Outer o = new Outer();

o.disp();
p.show();


}
}