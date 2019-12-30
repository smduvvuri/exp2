package Calculator;
import java.io.*;

public class Iomodex {
	public static void main(String[] args) throws Exception
	{
		long startTime=System.currentTimeMillis();
		Iomodex ex=new Iomodex();
		ex.execute();
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println("hi=" +executionTime);		
	}
	public void execute() throws Exception
	{
		InputStream is=null;
		OutputStream os=null;
		try {	
		File inputFile=new File("D:/IOexamples/Hi.txt");
		is=new FileInputStream(inputFile);
		File outFile=new File("D:/IOexamples/Test9");
		//os=new FileOutputStream(outFile);
		int readBytesCount;
		byte[] buffer=new byte[1000];
		BufferedInputStream bis=new BufferedInputStream(is);
		while((readBytesCount=is.read(buffer))>=0)
		{
			os.write(buffer,0,readBytesCount);
		}
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

