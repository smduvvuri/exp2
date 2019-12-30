package Calculator;
import java.io.*;

public class IoEx2 {
	public static void main(String[] args) throws Exception
	{
		IoEx2 ex=new IoEx2();
		ex.execute();
	}
	public void execute() throws Exception
	{
		InputStream is=null;
		OutputStream os=null;
		try {	
		File inputFile=new File("D:/IOexamples/Hi.txt");
		is=new FileInputStream(inputFile);
		File outFile=new File("D:/IOexamples/Test2");
		os=new FileOutputStream(outFile);
		int read;
		int count=0;
		while((read=is.read())>=0)
		{
			count++;
		 os.write(read);
		}
		 System.out.println("number of bytes written="+count);

				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			if(is!=null)
			{
				is.close();
			}
			if(os!=null)
			{
				os.close();
			}
		}}}


