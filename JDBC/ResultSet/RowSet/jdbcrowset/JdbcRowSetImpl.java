import java.sql.*;
import javax.sql.rowset.*;
import javax.sql.*;
//import javax.sql.rowset.RowSetProvider
import com.sun.rowset.JdbcRowSetImpl;
 class JdbcRowSetImp
{
public static void main(String...s)
	{
		try{  
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
JdbcRowSet jdbcrs=new JdbcRowSetImpl(c);
jdbcrs.setType(ResultSet.TYPE_SCROLL_SENSITIVE);	
jdbcrs.setConcurrency(ResultSet.CONCUR_UPDATABLE);
jdbcrs.addRowSetListener(new ListenerInterfacejavax());	
jdbcrs.setCommand("select name , id from resultset23");
jdbcrs.execute();
jdbcrs.setFetchSize(2);
while(jdbcrs.next())
{
	System.out.print(jdbcrs.getString(1)+"  ");
	System.out.println(jdbcrs.getString(2));
}
	}catch(Exception e){System.out.println(e);}
	
	}		
	
}
class ListenerInterfacejavax implements RowSetListener
{
	public void cursorMoved(RowSetEvent rse)//cursor move by next(),a RowSet object's cursor has moved.
	{
			System.out.println(" cursorMoved ");
	}
	public void rowChanged(RowSetEvent rse)//row change in db, a RowSet object has had a change in one of its rows.
	{
			System.out.println(" rowChanged ");
	}
	public void rowSetChanged(RowSetEvent rse)//whenever rowsetChange at insert,update,,a RowSet object in the given RowSetEvent object has changed its entire contents.
	{
			System.out.println(" rowSetChanged ");
	}
}
