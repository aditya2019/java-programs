import java.io.*;
class DeleteFolder
{
	public static void main(String...ss)
	{
		File f=new File("D:\\project file");
		deleteFolder(f);
		f.delete();
	}
		public static void deleteFolder(File f)
		{
			File file[]=f.listFiles();
			for(File a:file)
			{
				if(a.isDirectory())
				{
					deleteFolder(a);
				}
				a.delete();
			}
		}
	
}