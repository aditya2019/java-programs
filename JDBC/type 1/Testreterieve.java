import java.sql.*;
class Testreterieve{
	public static void main(String...s1)
	{
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("jdbc:odbc:mydsn","system","mca6");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select *from emp");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
}