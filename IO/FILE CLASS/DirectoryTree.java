 import java.io.*;
 class DirectoryTree
 {
 public static void main(String a[])
 {
	 File f=new File(a[0]);
	 if(!f.exists())
	 {
System.out.println("file does't exists");	
return ;	 
	 }
 tree(a[0]);
 }
	 public static void tree(String file)
	 {
		 File ff=new File(file);
		 if(!ff.isDirectory())
		 {
System.out.println(file);			 
			 return;
		 }
		 String s[]=ff.list();
		 for(String ss:s)
		 {
			 tree(file+ File.separator +ss);
		 }
	 }
 }
 