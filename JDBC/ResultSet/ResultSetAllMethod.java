import java.sql.*;
public class ResultSetAllMethod
{
		public static void main(String...s)
	{
		try{
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
			Statement st=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select name,id from resultSet23");
			/*while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			DatabaseMetaData dbmd=c.getMetaData();
			boolean b=dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE);
			System.out.println(b);
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}*//*
			int y=rs.getType();
			System.out.println(y+".......rs.getType();.........");
			rs.absolute(2);
			System.out.println(".......2.........");
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			//rs.last();
			rs.absolute(1);
			int x=rs.getRow();
			System.out.println(x+".......relative.........");
			
			rs.relative(4); 
			 x=rs.getRow();
			System.out.println(x+".......relative.........");
			
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}		
		
			System.out.println(ResultSet.CONCUR_UPDATABLE);
			System.out.println(ResultSet.TYPE_SCROLL_SENSITIVE);
				 y=rs.getType();
			System.out.println(y+".......rs.getType();.........");
			System.out.println(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)+" db supports");
			System.out.println(rs.getConcurrency()+"  ....resultSetConcurrency");
			
			//..............................
			rs.absolute(5);
			System.out.println(rs.getRow());
			rs.relative(-2);
			System.out.println(rs.getRow());
			//rs.deleteRow();
			rs.absolute(1);
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}	
			System.out.println(".......................update..............................................");
			rs.absolute(1);
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}*/
			//updating 2nd ,3rd row...... means 1,2 will be updated
			rs.absolute(1);
			//rs.deleteRow();	
			rs.updateString(1,"rowselected is third");
			rs.updateInt(2,420);
			rs.updateRow();
			//rs.absolute(1);
			rs.beforeFirst();
				//rs.refreshRow();
			while(rs.next())
			{
				System.out.print(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			//inserting a row into result then putting that into db,this row will be updated at curser position currently
			//at last
			
			System.out.println(".....................insertrow....................................");
			//rs.absolute(2);
			rs.moveToInsertRow();
			rs.updateString("name","zxcvbnmqwert");
			rs.updateInt("id",98765);
			rs.insertRow();
			
			rs.absolute(1);

	
			while(rs.next())
			{
				System.out.print(rs.getString(1)+"  ");
				System.out.println(rs.getString(2));
			}
						System.out.println("...................Insertionfinish......................................");
			
			ResultSet rs1=st.executeQuery("select name,id from resultSet23");
			
			while(rs1.next())
			{
				System.out.print(rs1.getString(1)+"  ");
				System.out.println(rs1.getString(2));
			}		
//.......................................
System.out.println(".........................................................");
	
//st.executeUpdate("insert into resultSet23 values('mohan12345',2221)");		
System.out.println(".........................................................");
		//ResultSet rs3=st.executeQuery("select name,id from resultSet23");
System.out.println(".........................................................");
	
			while(rs1.next())
			{
				System.out.print(rs1.getString(1)+"  ");
				System.out.println(rs1.getString(2));
			}		
			/*System.out.println("......................refreshrow...........................");
			rs1.absolute(1);
			rs1.refreshRow();
			System.out.println("......................getCursorName...........................");
			System.out.println(rs.getCursorName());*/
	}catch(Exception e){System.out.println(e);}}}  