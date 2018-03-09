import java.sql.*;
public class ResultSetInsert
{
	public static void main(String...s)
	{    Statement st=null;
	     ResultSet rs=null;
		try{/*
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
			st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=st.executeQuery("select *from bank1");*/
			 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs= st.executeQuery("select * from bank1");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"  ");
				System.out.println(rs.getInt(2));
			}
		rs.moveToInsertRow();
		rs.updateInt(1,121);
		rs.updateInt(2,10000);
		rs.insertRow();
		rs.beforeFirst();
		rs= st.executeQuery("select * from bank1");
		System.out.println("after insert new record");
		while(rs.next())
		{

			System.out.print(rs.getInt(1)+"=");
			System.out.print(rs.getInt(2));
			System.out.println();
		}
		}catch(Exception e){System.out.println(e);}
	}
}
