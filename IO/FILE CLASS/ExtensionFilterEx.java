import java.io.File;
import java.io.FilenameFilter;
class ExtensionFilter implements FilenameFilter
{
	String ext;
	public ExtensionFilter(String ext)
	{
		this.ext="." + ext;
	}
	public boolean accept(File dir,String name)
	{
		return name.endsWith(ext);
	}
}
public class ExtensionFilterEx
{
	public static void main(String...sss)
	{
		String dir ="C:\\Users\\Rahul\\Desktop\\java";
		File f = new File(dir);
		FilenameFilter only=new ExtensionFilter("class");
		 String s[]=f.list(only);
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}		
	}
}