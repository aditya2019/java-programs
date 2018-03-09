class Outer
{
int x=80;
class Inner
{
 
void show()
{

System.out.println(x);
}}
public static void main(String... m){
Outer o =new Outer();
Outer.Inner i =o.new Inner();
i.show();
} 
}