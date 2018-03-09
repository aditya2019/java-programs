class Nonparametrised
{
int x;
int y;
Nonparametrised()
{
x=10;
y=20;
}
void show()
{
System.out.println(x + " " + y);
}
public static void main(String d[])
{
Nonparametrised t =new Nonparametrised();
t.show();
Nonparametrised e=new Nonparametrised();
e.show();
}
}