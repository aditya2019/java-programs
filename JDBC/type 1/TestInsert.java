import java.sql.*;
class TestInsert
{
	public static void main(String...ss)
	{
		try{
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection c=DriverManager.getConnection("jdbc:odbc:mydsn","system","mca6");
            
			String t1="Bus1";
			String t2="117";
			Statement s=c.createStatement();
			int x=s.executeUpdate("insert into emp values('"+t1+"',"+t2+")");
			System.out.println(x);
			ResultSet rs=s.executeQuery("select * from emp");
			while(rs.next())
			{System.out.print(rs.getString(1));
		System.out.println(rs.getInt(2));
				
			}
		}catch(SQLException i){System.out.println(i);}catch(Exception e){System.out.println(e);}
	}
}