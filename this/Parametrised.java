class Parametrised
{
int x;
int y;
Parametrised(int z,int t)
{
x=z;
y=t;
}
void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String... d)
{
Parametrised p = new Parametrised(30,40);
p.show();
Parametrised t=new Parametrised(44,99);
t.show();
}
}