import java.sql.*;
import java.io.*;
class Oracle
{
	public static void main(String...s)throws Exception
	{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement st=c.createStatement();
		//st.executeUpdate("create table emp66(id number,nme varchar2(20))");
		st.close();
		int t1=123;
		String t2="lsfalu";
		PreparedStatement ps=c.prepareStatement("insert into emp66 values(?,?)");
		ps.setInt(1,t1);
		ps.setString(2,t2);
		ps.execute();
		ps=c.prepareStatement("select * from emp66 where id=? ");
		ps.setInt(1,t1);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.print("hii");
			System.out.print(rs.getString("nme")+" ");
			System.out.println(rs.getInt("id"));
		}
		
	}
}