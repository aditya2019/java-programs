import java.sql.*;
class MyUpdatableResultSet1
{
	public static void main(String...s)
	{
		try{
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
			Statement st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select accno,bal from bank1");
			while(rs.next())
			{
				if(rs.getInt(1)==3)
				{   
		            rs.updateDouble(2,500000);
					rs.updateRow();
				}
			}
			//System.out.println(i);
		}catch(Exception e){e.printStackTrace();}
		
	}
}