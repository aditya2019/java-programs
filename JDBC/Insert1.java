import java.sql.*;
class Insert1
{
	public static void main(String...s1)
	{
		try{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement s=c.createStatement();
		String t1="audiq7";
		int t2=807682;
		int x=s.executeUpdate("create table emp55(name varchar2(20),phone number)");
		int y=s.executeUpdate("insert into emp55 values('"+t1+"',"+t2+")");
		System.out.println(x+"   "+y);
		ResultSet rs=s.executeQuery("select * from emp55");
        while(rs.next())
		{
			System.out.print(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		
	}catch(	SQLException e){e.printStackTrace();}catch(Exception i){i.printStackTrace();}}
}