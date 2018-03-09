import java.util.*;
class HashMapDemo1
{
	public static void main(String...ss)
	{
		HashMap<Emp,String> hm=new HashMap<>();
		hm.put(new Emp(10),"aaaa");
		hm.put(new Emp(10),"bbbb");
		hm.put(new Emp(10),"cccc");
		hm.put(new Emp(10),"dddd");
		//System.out.print(hm);
		Set s=hm.entrySet();
		Iterator<Map.Entry> i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=i.next();
			Emp k=(Emp)e.getKey();
			String v=(String)e.getValue();
		System.out.print(k+" = "+v);
		}

	}
}
class Emp{
	int n;
	Emp(int n)
	{
		this.n=n;
		hashCode();
	}
	public int hasCode()
	{
		return n*10;
	}
}