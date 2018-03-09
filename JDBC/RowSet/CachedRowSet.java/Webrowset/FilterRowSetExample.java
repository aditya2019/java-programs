import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.RowSet;
import java.sql.SQLException;
import com.sun.rowset.FilteredRowSetImpl;
class Filter1 implements Predicate
{
	String colname;
	public Filter1(String colname)
	{
		this.colname=colname;
	}
	public boolean evaluate(RowSet rs)
	{
		try{
			CachedRowSet crs=(CachedRowSet)rs;
			String obj=crs.getString(colname);
			if(obj!=null &&((obj.charAt(0)=='K')||(obj.charAt(0)=='m')))
				return true;
			else
              return false;
		
		}catch(SQLException e){System.out.println(e);return false;}
	}
	public boolean evaluate(Object arg0,int arg1)
	{
			return false;
	}
	public boolean evaluate(Object arg0,String arg1)
	{
	return false;
	}	
}


class FilterRowSetExample
{
	public static void main(String...s)throws Exception
	{
	FilteredRowSet frs=new FilteredRowSetImpl();
frs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
frs.setUsername("system");
frs.setPassword("mca6");
frs.setCommand("select * from emp");	
frs.setFilter(new Filter1("naem"));
frs.execute();
while(frs.next())
{
	System.out.println(frs.getString(1)+" "+frs.getString(2));
}
	}
}