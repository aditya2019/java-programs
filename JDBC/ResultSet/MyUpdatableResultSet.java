import java.sql.*;
class MyUpdatableResultSet
{
	public static void main(String...s)
	{try{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("select accno,bal from bank1");
		rs.next();
		rs.deleteRow();
		System.out.print("record deleted");
	}catch(Exception e){System.out.println(e);}
	}
}