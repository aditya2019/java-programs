import java.sql.*;
public class BatchUpdate
{
public static void main(String...s)
{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement st=c.createStatement();
		String s1="update emp set naem='shyam'";
		String s2="insert into emp values('hhh',123)";
		String s3="delete from emp where dept_id=2";
		st.addBatch(s1);
		st.addBatch(s2);
		st.addBatch(s3);
		st.executeBatch();
		ResultSet rs=st.executeQuery("select *from emp");
		while(rs.next())
		{
			System.out.println("emp name is "+rs.getString(1));
			System.out.println("emp Dept_ID is "+rs.getInt(2));
		}
	}catch(Exception e){System.out.println(e);}
}
}