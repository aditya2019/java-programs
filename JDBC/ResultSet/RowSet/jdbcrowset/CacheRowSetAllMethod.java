import java.sql.*;
import javax.sql.rowset.*;
import javax.sql.*;
//import javax.sql.rowset.RowSetProvider
import com.sun.rowset.CachedRowSetImpl;
 class CacheRowSetAllMethod
{
	public static void main(String...s)
	{
		try{  

CachedRowSet crs=new CachedRowSetImpl();
crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
crs.setUsername("system");
crs.setPassword("mca6");
crs.setCommand("select *from awtable");
crs.execute();
while(crs.next())
{
	System.out.print(crs.getString(1)+" ");
	System.out.println(crs.getString(2));
}
	}catch(Exception e){System.out.println(e);}
	
	}
}