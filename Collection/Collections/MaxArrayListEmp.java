import java.util.Collections;
import java.util.ArrayList;
class MaxArrayListEmp
{
	public static void main(String...s)
	{
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp(10));
		al.add(new Emp(15));
		al.add(new Emp(11));
		al.add(new Emp(12));
		al.add(new Emp(1));
		al.add(new Emp(13));
		Emp e1=(Emp)Collections.max(al);
		Emp e2=(Emp)Collections.min(al);
		System.out.println("max = "+ e1.id+" min = "+e2.id);
	}
}
class Emp implements Comparable<Emp>
{
	int id;
	Emp(int id)
	{
		this.id=id;
	}
	public int compareTo(Emp e)
	{
		if(this.id>e.id)
		{
			return 1;
		}else if(this.id<e.id)
		{
			return -1;
		}else{return 0;}
	}
}