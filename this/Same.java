class Same
{
Same()
{
System.out.println("in constructor");
}
void Same()
{
System.out.println("in return type");
}
public static void main(String... k)
{
new Same().Same();


}
}