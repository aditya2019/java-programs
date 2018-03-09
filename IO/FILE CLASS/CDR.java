import java.io.*;
class CDR
{
	public static void main(String...sss)throws IOException
	{
		File newFile=new File("my_new_file.txt");
		printFileDetail(newFile);
		//create file
		boolean b=newFile.createNewFile();//if created then b=true else false
		if(!b)
		{
			System.out.println("File Not created");
		}
			printFileDetail(newFile);
			
	//Deleting the file	
  newFile.delete();	
  System.out.println("After deleting the file");
  printFileDetail(newFile);
  //recreating the file
  newFile.createNewFile();
  printFileDetail(newFile);
  //let's tell JVM to delete file on close
  newFile.deleteOnExit();
  System.out.println("File closed on exit ");
    printFileDetail(newFile);
	//create new  file
File f1=new File("My_first_File.txt");
File f2=new File("My_Second_File.txt");
boolean filecreated=f1.createNewFile();
if(filecreated||f1.exists())
{
	 printFileDetail(f1);
	 printFileDetail(f2);
	 boolean renameFlag=f1.renameTo(f2);
	 if(!renameFlag)
	 {
		  System.out.println("File not created"); 
	 }
	 printFileDetail(f1);
	 printFileDetail(f2);
	
}	
	}
	
	public static void printFileDetail(File f)
	{
				  System.out.println("Absolute path = "+f.getAbsoluteFile());
				  System.out.println("file Exists = "+f.exists());
	}
}