import java.util.ArrayList;
class ArrayListToArray
{
	public static void main(String...s)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("hii");
		al.add("hii1");
		al.add("hii2");
		al.add("hii3");
		al.add("hii4");
		al.add("hii5");
		String array[]=new String[al.size()];
		for(int i=0;i<al.size();i++)
		{
			array[i]=al.get(i);
		}
		for(String ss:array)
		System.out.print(ss);
	}
}