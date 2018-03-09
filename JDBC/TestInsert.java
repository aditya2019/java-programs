import java.sql.*;
class TestInsert
{
	public static void main(String...s1)
	{
		try{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
            String t1="fortuner";
			String t2="110";
			Statement s=c.createStatement();
			int x=s.executeUpdate("insert into emp101 values('"+t1+"','"+t2+"')");
			System.out.println(x);
			ResultSet rs=s.executeQuery("select * from emp101");
			while(rs.next())
			{System.out.print(rs.getString(1));
		System.out.println(rs.getString(2));
				
			}
		}catch(SQLException i){System.out.println(i);}catch(Exception e){System.out.println(e);}
	}
}