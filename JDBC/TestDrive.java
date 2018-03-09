import java.sql.*;
public class TestDrive
{
public static void main(String...ss)
{
	
try
{
//Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
Statement s=c.createStatement();
ResultSet rs=s.executeQuery("select * from emp101");
while(rs.next())
{
	
System.out.println(rs.getString("name")+"  "+rs.getString(2));
}
}catch(SQLException e){System.out.println(e);}catch(Exception i){System.out.println(i);}
}
}