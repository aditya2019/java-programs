import java.sql.*;
class CllableAbleUsinginsertAwtable
{
	public static void main(String...s)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
			CallableStatement cst=c.prepareCall("{call insertAwtable(?,?,?)}");
			cst.setString(1,"raman");
			cst.setInt(2,123);
			cst.setInt(3,853123547);
			cst.executeUpdate();
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("select * from awtable");
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.println(rs.getString(3));
			}
		}catch(Exception e){System.out.println(e);}
	}
	}
