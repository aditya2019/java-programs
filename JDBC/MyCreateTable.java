import java.sql.*;
public class MyCreateTable 
{
	public static void main(String...s) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
		Statement s1=c.createStatement();
		//int x=s1.executeUpdate("create table cityname(name varchar2(10),state varchar2(10),population number(10),pincode number(6) unique)");
		int y=s1.executeUpdate("insert into cityname values('gr. noida','up',25000,20130)");
			//System.out.println(" "+y);
		ResultSet rs=s1.executeQuery("select *from cityname");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString("pincode"));
		}
	}
}