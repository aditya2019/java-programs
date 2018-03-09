import java.sql.*;
public class driverLoading
{
	public static void main(String...s)
	{
		try{
			new oracle.jdbc.driver.OracleDriver();
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","aditya","mca6");
			DatabaseMetaData d=c.getMetaData();
			System.out.println(d.getURL());
		}catch(Exception e){System.out.println(e);}
	}
}
