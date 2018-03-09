import java.util.*;
import java.sql.*;
class TestDelete
{
	public static void main(String...ss)
	{try{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		System.setProperty("jdbc.drivers","oracle.jdbc.driver.OracleDriver");
		Properties p=new Properties();
		p.put("user","system");
		p.put("password","mca6");
		int t1=2;
	Connection c=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",p);
	Statement s=c.createStatement();
	//int a=s.executeUpdate("delete from emp102 where id = "+ t1 +"");
	//System.out.println(a);
	ResultSet rs=s.executeQuery("Select * from emp102");
	while(rs.next())
	{
		System.out.print(rs.getString(1)+" "+rs.getInt(2));
	}
	}catch(SQLException e)
	{System.out.print(e);}
	catch(Exception i){
	System.out.print(i);}
	}
}