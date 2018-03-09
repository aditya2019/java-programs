import java.io.*;
import java.sql.*;
import javax.sql.*;
class GetTime
{
	public static void main(String...s)throws Exception 
	{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement st=c.createStatement();
		st.executeUpdate("delete table survey113");
		st.executeUpdate("create table survey113(id number(10),time TIMESTAMP)");
		String insert_rec="insert into survey113 values(?,?)";
		PreparedStatement pst=c.prepareStatement(insert_rec);
		pst.setInt(1,20);
		java.sql.Time sqlDate=new java.sql.Time(new java.util.Date().getTime());
		pst.setTime(2,sqlDate);
		pst.executeUpdate();
		
	   ResultSet rs=st.executeQuery("select *from survey113");
	   while(rs.next())
	   {
		   System.out.println(rs.getTime(2));
	   }
		
	}
}