import java.sql.*;
 class SensitiveOverInsensitive
{
	
		public static void main(String...s)
	{
		try{
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
			Statement st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			DatabaseMetaData dbmd=c.getMetaData();
			System.out.println(dbmd.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));
			System.out.println(dbmd.supportsResultSetHoldability(ResultSet.CLOSE_CURSORS_AT_COMMIT));
			System.out.println(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
			System.out.println(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE));
			
Statement st1=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE,ResultSet.HOLD_CURSORS_OVER_COMMIT);
		
			Mythread1 t1=new Mythread1(st,st1);
			t1.start();
			st.setFetchSize(1);
			
	}catch(Exception e){System.out.println(e);}}
}
class Mythread1 extends Thread
{
	Statement st,st1;
	ResultSet rs;
	Mythread1(Statement st,Statement st1)
	{
		this.st=st;
		this.st1=st1;
		
	}
	public void run()
	{
		try{
		ResultSet rs=st.executeQuery("select name,id from resultSet23");
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			Mythread2 t2=new Mythread2(st1);
			t2.start();
			try{t2.join();}catch(Exception eee){System.out.print(eee);}
			rs.beforeFirst();
				System.out.print("after changes");
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}
	}catch(Exception e){System.out.println(e);}
	}
}

class Mythread2 extends Thread
{
	Statement st1;
	ResultSet rs1;
	Mythread2(Statement st1)
	{
		this.st1=st1;
		
	}
	public void run()
	{
		try{
			st1.executeUpdate("update resultSet23 set name='rahul kumar yadav' where id=5345234");
			st1.execute("commit");
			Thread.sleep(2000);
}catch(Exception e){System.out.println(e);}



}}