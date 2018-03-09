import java.util.Collections;
import java.util.ArrayList;
class CopyArrayList
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		ArrayList<String> myal=new ArrayList<String>();
	myal.add("one");
	myal.add("two");
	myal.add("three");
	myal.add("four");
	myal.add("five");
Collections.copy(myal,al);
System.out.println(myal);
	}
}