import java.io.*;
class MyCharArrayReaderWriter
{
	public static void main(String...sa) throws IOException
	{
		CharArrayWriter c = new CharArrayWriter();
		String s="MyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterMyCharArrayReaderWriterIndia is good country India is good country India is good country India is good country India is good country India is good country ";
		char ch[]=s.toCharArray();
		c.write(ch);
		FileWriter fw=new FileWriter("a11.txt");
		c.writeTo(fw);

c.close();		
fw.close();
	}
}