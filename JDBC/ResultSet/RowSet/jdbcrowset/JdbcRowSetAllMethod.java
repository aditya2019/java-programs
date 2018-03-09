import java.sql.*;
import javax.sql.rowset.*;
javax.sql.rowset.RowSetProvider
//import com.sun.rowset.RowSetImpl;
public class JdbcRowSetAllMethod
{
	//jdbc row set work in connected mode
	public static void main(String...s)
	{
		try{             
		RowSetFactory rsf=RowSetProvider.newFactory();
		JdbcRowSet jrs=rsf.createJdbcRowSet();
		jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		jrs.setUsername("system");
		jrs.setPassword("mca6");
		jrs.setCommand("select *from awtable");
		jrs.execute();
		while(jrs.next())
		{
			System.out.print(jrs.getString(1)+" ");
			System.out.println(jrs.getString(2));
		}
	}catch(Exception e){System.out.println(e);}
	}
}
