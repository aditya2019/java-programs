import java.io.*;
import java.sql.*;
import javax.sql.*;
class BlobClobEx
{
	public static void main(String...s)throws Exception 
	{
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","mca6");
		Statement st=c.createStatement();
		
		try{
			st.executeUpdate("drop table blobclob");
		}catch(SQLException ee){
		if(ee.getErrorCode()==942){
			System.out.println("error drpoing blobclob table"+ee.getMessage());
		}
		}
		if(st.executeUpdate("create table blobclob(id number(10),b BLOB,c CLOB )")==0)
		{
		System.out.println("table blobclob created");
	
		}
		
         PreparedStatement pst=c.prepareStatement("insert into blobclob values(40,?,?)");
		 File f=new File("blob.txt");
		 FileInputStream fin=new FileInputStream(f);
		 pst.setBinaryStream(1,fin,(int)f.length());
          f=new File("clob.txt");
		  fin=new FileInputStream(f);
		 pst.setAsciiStream(2,fin,(int)f.length());
		 pst.execute();
		 fin.close();
		  System.out.println("working");
		 ResultSet rs=st.executeQuery("select * from blobclob where id=40");
		  System.out.println("working");
		 rs.next();
		
	java.sql.Blob bl=rs.getBlob(2);
		 java.sql.Clob cl=rs.getClob(3);
	byte arrb[]=new byte[(int)bl.length()];
	InputStream bls=bl.getBinaryStream();
	bls.read(arrb);
	String bltext=new String(arrb);
	System.out.println(bltext);
	 bls.close();
		char ch[]=new char[(int)cl.length()];
		Reader r=cl.getCharacterStream();
		 r.read(ch);
		 String chr=new String(ch);
		 System.out.println(chr);
 r.close();
 c.close();
 }
	
}