import java.io.*;
import java.sql.*;
import javax.sql.*;
class GetDate
{
		public static void main(String...s)throws Exception 
	{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
		Statement st=c.createStatement();
		st.executeUpdate("create table survey(id number(10),mydate DATE DEFAULT(sysdate))");
	   PreparedStatement pst=c.prepareStatement("insert into  survey (id ,mydate) values(?,?)");
	   pst.setInt(1,121);
	   java.sql.Date sqldate=new java.sql.Date(new java.util.Date().getTime());
	   pst.setDate(2,sqldate);
	   pst.executeUpdate();
	   ResultSet rs=st.executeQuery("select *from survey");
	   while(rs.next())
	   {
		   System.out.println(rs.getDate(2));
	   }
		
	
	
}}