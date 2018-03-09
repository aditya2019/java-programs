class Concept
{
int x=getx();
int getx()
{
System.out.println(x);
return 10;
}
 Concept C(Concept this)
{
System.out.println("concept method "+ this.x);
System.out.println("with this " + this.x);
return this;
}
public static void main(String... s)
{
Concept t1=new Concept();
Concept t2=t1.C(t1);

System.out.println("in t1 "+t1);
System.out.println("in t2 "+t2);
}
}