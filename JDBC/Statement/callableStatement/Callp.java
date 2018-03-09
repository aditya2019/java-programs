import java.io.*;
import java.sql.*;
public class Callp
{
	public static void main(String...s)
	{
		try{
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
			Statement st=c.createStatement();
			CallableStatement cs=c.prepareCall("{Call recins88(?,?)}");
			cs.setInt(1,21);
			cs.setString(2,"September");
			cs.executeUpdate();
			ResultSet rs=st.executeQuery("select *from emp65");
			while(rs.next())
			{
				System.out.print(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			
			
		}catch(Exception e){System.out.println(e);}
	}
}