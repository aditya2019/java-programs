import java.util.*;
class MyListDisjoint
{
	public static void main(String...s)
	{
		List<String> al=new ArrayList<>();
		al.add("Apple");
		al.add("Airtel");
		al.add("java");
		al.add("c++");
		al.add("unix");
		List<String> al1=new ArrayList<>();
		al1.add("job");
		al1.add("job1");
		al1.add("job2");
		al1.add("job3");
		boolean isCommon=Collections.disjoint(al,al1);
		System.out.println("does't found any common ele ?"+isCommon);
		al1.add("java");
		isCommon=Collections.disjoint(al,al1);
		System.out.println("does't found any common ele ?"+isCommon);
	}
	
}