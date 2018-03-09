import java.util.*;
class MyMaxComparator
{
	public static void main(String...s)
	{
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(10,"Rahul",25000));
		l.add(new Emp(20,"Rahul yadav",45000));
		l.add(new Emp(10,"krish",5000));
		l.add(new Emp(10,"john",14000));
		l.add(new Emp(10,"krishor",24000));
		Emp maxSal=Collections.max(l,new EmpComp());
		Emp minSal=Collections.min(l,new EmpComp());
		System.out.println(maxSal+" "+minSal);
		
	}
}
class EmpComp implements Comparator<Emp>
{
	@Override
	public int compare(Emp e1,Emp e2)
	{
		return e1.getSalary().compareTo(e2.getSalary());
	}
}
class Emp
{
	private int id;
	private String name;
	private Integer Salary;
	public Emp(int id,String name,Integer sal)
	{
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	public int getSalary()
	{
		return Salary;
	}
	public String toString()
	{
		return id+" "+name+" "+Salary;
	}
}