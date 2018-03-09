class This
{
int x=10;
void show(int x)
{
System.out.println("Data shadowing");
System.out.println("in fun show val of x " +x);// while there is x=10 but there is shadow of local variable
System.out.println("in fun show val of x " + x);
}
static void display(int y ,This w)
{
System.out.println("in fun disp val of x " +w.x);
System.out.println("in fun disp val of y " + y);
}
void ptr( int x, This s)// now it is alternate of data shadowing
{
System.out.println("in fun ptr val of x " + x);
System.out.println("in fun ptr val of y " + s.x);
}

public static void main(String... s)
{
This t1 = new This();
t1.display(30,t1);
t1.show(20);
System.out.println( "in main method " + t1.x);
t1.ptr(66,t1);

}
}
