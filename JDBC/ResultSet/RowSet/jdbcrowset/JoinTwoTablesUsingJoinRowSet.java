import javax.sql.rowset.*;
//import com.sun.rowset.JoinRowsetImpl;
//import com.sun.rowset.CachedRowsetImpl;
import com.sun.rowset.*;
class JoinTwoTablesUsingJoinRowSet
{
	public static void main(String...s)
	{
		try{
			CachedRowSet crs=new CachedRowSetImpl();
			crs.setUrl("jdbc:mysql://localhost:3306/rahul");
			crs.setUsername("rahul23");
			crs.setPassword("rahul23");
			crs.setCommand("select name,age,salary from employee10");
			crs.execute();
	        CachedRowSet crs1=new CachedRowSetImpl();
			crs1.setUrl("jdbc:mysql://localhost:3306/rahul");
			crs1.setUsername("rahul23");
			crs1.setPassword("rahul23");
			crs1.setCommand("select dname,name from employeedid");
			crs1.execute();
	JoinRowSet jrs=new JoinRowSetImpl();
	jrs.addRowSet(crs,1);
	jrs.addRowSet(crs1,2);
	jrs.addRowSetListener(new ListenerInterfacejavax());
	while(jrs.next())
	{
		System.out.print(jrs.getString(1)+" ");
		System.out.print(jrs.getString(2)+" ");
		System.out.print(jrs.getString(3)+" ");
		System.out.println(jrs.getString(4));
	
	}
	
	}catch(Exception e){System.out.println(e);}
	}
}