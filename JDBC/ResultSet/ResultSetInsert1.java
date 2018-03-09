import java.sql.*;
class ResultSetInsert1
{
	public static void main(String...s)
	{
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
			Statement st=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select accno,bal from bank1");
			while(rs.next())
			{
				System.out.print(rs.getInt("accno")+"  ");
				System.out.println(rs.getInt("bal"));
			}
			DatabaseMetaData dbmd=c.getMetaData();
			boolean b=dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE);
			boolean b1=dbmd.supportsResultSetType(ResultSet.CONCUR_UPDATABLE);
			if(b==true)
				System.out.println("ResultSet is INSENSITIVE");	
			if(b1==true)
				System.out.println("ResultSet is UPDATABLE");
			int x=rs.getType();
				System.out.println(x+" "+ResultSet.TYPE_SCROLL_INSENSITIVE +" "+ResultSet.CONCUR_UPDATABLE);
			rs.moveToInsertRow();
			rs.updateInt("accno",876);
			rs.updateLong("bal",32);
           rs.insertRow();
		   rs.beforeFirst();
		    //rs.absolute(6);
			//rs.relative(-2);
			int y=rs.getRow();
			System.out.println(y);
			if(rs.isBeforeFirst())
				System.out.println("rs is beforeFirst");
			else if(rs.isAfterLast())
				System.out.println("rs is AfterLast");	
			else if(rs.isFirst())
					System.out.println("rs is on First");
			//rs.refreshRow();  //why this is unable to get updated data in rs from db 
			rs=st.executeQuery("select accno,bal from bank1");  //we need to use this to get updated rs
		    while(rs.next())
			{ 
				System.out.print(rs.getInt("accno")+"  ");
				System.out.println(rs.getInt("bal"));
			}
		}catch(SQLException e){System.out.println(e);}catch(Exception e){System.out.println(e);}
	}	
	
}