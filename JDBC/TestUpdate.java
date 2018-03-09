import java.util.*;
import java.sql.*;
class TestUpdate
{
	public static void main(String...s1)
	{try{
		Driver d=new oracle.jdbc.driver.OracleDriver();
		Properties dbprop=new Properties();
		dbprop.put("user","system");
		dbprop.put("pass","mca6");
		Connection c=d.connect("jdbc:oracle:thin:@localhost:1521:xe",dbprop);
		Statement s=c.createStatement();
		String z="bmw";
		String t4="1";
		int z1=s.executeUpdate("update cityname set name = '"+z+"' where pincode in(201308)");
		System.out.println(z1);
		ResultSet rs=s.executeQuery("Select *from emp101");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
	}catch(SQLException e)
	{System.out.println(e);
	}catch(Exception i)
	{System.out.println(i);
	}
		
	}
}