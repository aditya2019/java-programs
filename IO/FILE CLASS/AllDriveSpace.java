import java.io.*;
class AllDriveSpace
{
	public static void main(String...sss)
	{
		File f[]=File.listRoots();
		long l=1024*1024*1024;
		for (File ff:f)
		{
			System.out.println(ff);
			System.out.println("free space"+ff.getFreeSpace()/l);
				System.out.println("usable space"+ff.getUsableSpace()/l);
					System.out.println("total space"+ff.getTotalSpace()/l);
		}
	}
}