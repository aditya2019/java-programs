import java.sql.*;
import java.util.*;
public class PropertiesConnectDriver
{
	public static void main(String...s)
	{
		try{
			Driver d=new oracle.jdbc.driver.OracleDriver();
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			Properties p= new Properties();
			p.put("user","system");
			p.put("password","mca6");
			Connection c=d.connect(url,p);
			DatabaseMetaData dm=c.getMetaData();
			System.out.println(c+"  --> "+dm.getURL());
	}catch(Exception e){System.out.println(e);}
}}