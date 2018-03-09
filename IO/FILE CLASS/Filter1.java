import java.io.File;
import java.io.FileFilter;
public class Filter1
{
	public static void main(String...sss)
	{
		String dir="C:\\Users\\Rahul\\Desktop\\java";
		File f=new File(dir);
		FileFilter filter=new FileFilter()
		{
			public boolean accept(File f)
			{
				if(f.isFile()||f.isDirectory())
				{
					String filename=f.getName().toLowerCase();
				
				if(filename.endsWith("class"))
				{
					return true;
				}}
				return false;
			}
		};
		
		File []list=f.listFiles(filter);
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
			{
				System.out.println(list[i].getPath()+"(file)");
			}else if(list[i].isDirectory())
			{
		System.out.println(list[i].getPath()+"(Directory)");
				
			}
		}
	}
}