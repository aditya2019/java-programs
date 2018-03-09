import java.io.File;
class ListAllFile
{
	public static void main(String...sss)
	{
		String s="c:\\";
		File f=new File(s);
		File[] list=f.listFiles();
		for(File ff:list)
		{
			if(ff.isFile())
			{
				System.out.println(ff.getPath()+"(File)");
			}
			else if(ff.isDirectory())
			{
				System.out.println(ff.getPath()+"(Directory)");
			}
		}
	}
}