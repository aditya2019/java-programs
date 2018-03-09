import java.sql.*;
class BatchUpdateThroughStatementPreparedStatementCallableStatementInsertUpdateDelete
{
	public static void main(String...s)
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		    Statement st=c.createStatement();
			String ins="insert into awtable values('madhusudan',16508,8942431329)";
			String upd="update  awtable set name='arvind' where phonenu='853'";
			String del="delete from awtable where id='2000'";
			st.addBatch(ins);
			st.addBatch(upd);
			st.addBatch(del);
			int x[]=st.executeBatch();
			for(int i:x)
			System.out.println(i);
			ResultSet rs=st.executeQuery("select *from awtable");
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.println(rs.getString(3));
			}
			System.out.println(".............................prepareStatement...........................");
			PreparedStatement pst=c.prepareStatement("insert into awtable values(?,?,?)");
			pst.setString(1,"manmohan");
			pst.setString(2,"1232");
			pst.setString(3,"9898232232");
			pst.addBatch();
			pst.setString(1,"radha");
			pst.setString(2,"32");
			pst.setString(3,"983232232");
			pst.addBatch();
			pst.setString(1,"krishna");
			pst.setString(2,"1232");
			pst.setString(3,"9833232232");
			pst.addBatch();
			pst.setString(1,"narayan");
			pst.setString(2,"1432");
			pst.setString(3,"9423232232");
			pst.addBatch();
				PreparedStatement pst1=c.prepareStatement("delete from awtable where id=?");
				pst1.setString(1,"16508");
				pst1.executeBatch();
		int y[]=	pst1.executeBatch();
		for(int i:y) 
			System.out.println(i);
		int z[]=	pst.executeBatch();
		for(int i:z) 
			System.out.println(i);
		ResultSet rs1=st.executeQuery("select *from awtable");
		while(rs1.next())
			{
				System.out.print(rs1.getString(1)+" ");
				System.out.print(rs1.getString(2)+" ");
				System.out.println(rs1.getString(3));
			}
		System.out.println(".............................CallableStatement...........................");
		CallableStatement cls=c.prepareCall("{Call insertawtable(?,?,?)}");
		cls.setString(1,"akash");
		cls.setString(2,"125");
		cls.setString(3,"9898121234");
		cls.addBatch();
		cls.setString(1,"aditya");
		cls.setString(2,"128");
		cls.setString(3,"9238121234");
		cls.addBatch();
		cls.setString(1,"vijay");
		cls.setString(2,"129");
		cls.setString(3,"9238121234");
		cls.addBatch();
		int a[]=cls.executeBatch();
		for(int b:a)
		System.out.println(b);
	ResultSet rs4=st.executeQuery("select * from awtable");
	while(rs4.next())
	{
			System.out.print(rs4.getString(1)+" ");
				System.out.print(rs4.getString(2)+" ");
				System.out.println(rs4.getString(3));
			
	}
			}catch(Exception e){System.out.println(e);}
	}
}