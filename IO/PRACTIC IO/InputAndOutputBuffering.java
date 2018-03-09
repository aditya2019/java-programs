import java.io.*;
public class InputAndOutputBuffering
{
  public static void main(String args[]) throws IOException
  {	// reading-side
    FileInputStream fistream = new FileInputStream("abc1.txt"); // a low-level stream
    BufferedInputStream bistream = new BufferedInputStream(fistream); // a high-level stream
// wriring-side
    FileOutputStream fostream = new FileOutputStream("abc1.txt"); // a low-level stream
    BufferedOutputStream bostream = new BufferedOutputStream(fostream);  // a high-level stream
  
    int temp;
    while( ( temp = bistream.read() ) != -1 )
    {
      bostream.write(temp);  
      System.out.print((char) temp);  
    }
    bostream.close();  fostream.close();
    bistream.close();   fistream.close();
  }
}