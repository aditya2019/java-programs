import javax.sql.rowset.*;
import com.sun.rowset.*;
import java.sql.*;
import javax.sql.RowSet;
class FilteredRowSetFetchFilteredrec
{
	public static void main(String...s)
	{
		try{
			
			FilteredRowSet frs=new FilteredRowSetImpl();
			frs.setUrl("jdbc:oracle:thin:@localhost:1521");
			frs.setUsername("System");
			frs.setPassword("mca6");
			frs.setCommand("select name,id,phonenu from awtable ");
			frs.setFilter(new implementingPradicateInterfaceHavingLogicToFileterRecord("name"));
			frs.execute();
			while(frs.next())
			{
				System.out.print(frs.getString(1)+" ");
				System.out.print(frs.getString(2)+" ");
				System.out.println(frs.getString(2));
			}
		}catch(Exception e){System.out.println(e);}
}
}

class implementingPradicateInterfaceHavingLogicToFileterRecord implements Predicate
{
	String fieldName;
	implementingPradicateInterfaceHavingLogicToFileterRecord(String fieldName)
	{
		this.fieldName=fieldName;
	}
	public boolean evaluate(RowSet rs)
	{
		try{
			CachedRowSet crs=(CachedRowSet)rs;
			String obj=crs.getString(fieldName);
			if(obj!=null&&(obj.charAt(0)=='l'||obj.charAt(0)=='r'))
			{
				return true;
			}else{return false;}
			
		}catch(Exception e){System.out.println(e);}
		return false;
	
	}
	public boolean evaluate(Object o,String st)
	{
		return false;
	}
		public boolean evaluate(Object o,int i)
	{
		return false;
	}
}