import java.sql.*;
public class DriverType4
{
		public static void main(String...s)
	{
		try{

		Connection c=DriverManager.getConnection("jdbc:odbc:mydsn");
		Statement st=c.createStatement();
		ResultSet rs=st.executeQuery("select *from emp");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		}catch(Exception e){System.out.println(e);}
		
	}
}