import java.sql.*;
public class MyBatchPrepareStatement
{
	public static void main(String...s)
	{
		Connection c=null;
		PreparedStatement pst=null;
	try{
		 c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement st=c.createStatement();
		pst=c.prepareStatement("update emp set naem=? where dept_id=?");
		pst.setString(1,"krishna");
		pst.setString(2,"1");
		pst.addBatch();
		pst.setString(1,"xyzzz");
		pst.setString(2,"3");
		pst.addBatch();
		pst.executeBatch();
		ResultSet rs=st.executeQuery("select *from emp");
		while(rs.next())
		{
			System.out.print("name  "+rs.getString(1)+" ");
			System.out.println("id  "+rs.getString(2));
		}
		
	}catch(Exception e){System.out.print(e);}
	
	}
}