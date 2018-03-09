import java.util.ArrayList;
class CompareArrayList
{
public static void main(String...s)
{
	ArrayList<String> al=new ArrayList<String>();
	al.add("hello");
    al.add("ji");
	al.add("sanam");
	al.add("Hum");
	al.add("a");
	al.add("gye");
    System.out.println(al);
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("hello");
	al1.add("ji");
	al1.add("sanam1");
	al1.add("hum1");
	al1.add("a1");
	al1.add("gye1");
	ArrayList<String> al2=new ArrayList<String>();
	for(String temp:al)
		al2.add(al1.contains(temp)?"yes":"no");
	
	System.out.println(al2);
		
	ArrayList<Integer> al3=new ArrayList<>();
	for(String temp:al)	
		al3.add(al1.contains(temp)?1:0);
		System.out.println(al3);
}
}