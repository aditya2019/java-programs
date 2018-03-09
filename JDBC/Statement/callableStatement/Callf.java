//import java.io.*;
import java.sql.*;
public class Callf
{
	public static void main(String...s)
	{
      try{
		  Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
           CallableStatement cs=c.prepareCall("{?=call sum2(?,?)}");
		   cs.setInt(2,30);
		   cs.setInt(3,50);
		   cs.registerOutParameter(1,Types.INTEGER);
		   cs.execute();
		   int a=cs.getInt(1);
		   System.out.println(a);
	  }catch(Exception e){System.out.println(e);}		
	}
}