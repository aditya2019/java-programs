import java.sql.*;
import java.util.*;
class TestUpdate
{
	public static void main(String...s1){
	try{
		Driver d=new sun.jdbc.odbc.JdbcOdbcDriver();
		Properties dbprop=new Properties();
		dbprop.put("user","system");
		dbprop.put("pass","mca6");
		Connection c=d.connect("jdbc:odbc:mydsn",dbprop);
		Statement s=c.createStatement();
		String z="bmw2";
		String t4="117";
		int z1=s.executeUpdate("update emp set name = '"+z+"' where id='"+t4+"'");
		System.out.println(z1);
		ResultSet rs=s.executeQuery("Select *from emp");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getInt(2));
		}
	}catch(SQLException e)
	{System.out.println(e);
	}catch(Exception i)
	{System.out.println(i);
	}
		
	}
}
