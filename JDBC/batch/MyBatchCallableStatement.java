import java.sql.*;
public class MyBatchCallableStatement
{
	public static void main(String...s)
	{
		CallableStatement callst=null;
	try{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
		Statement st= c.createStatement();
		callst=c.prepareCall("{Call recins88(?,?)}");
		callst.setInt(1,32);
		callst.setString(2,"Batch");
		callst.addBatch();
		callst.setInt(1,43);
		callst.setString(2,"addBatch1");
		callst.addBatch();
		int [] updateCounts=callst.executeBatch();
		ResultSet rs=st.executeQuery("select *from emp65");
		while(rs.next())
		{
			System.out.println("DEPT_ID "+rs.getInt(1));
			System.out.println("name "+rs.getString(2));
		}
	}catch(Exception e){System.out.println(e);};	
	}
}