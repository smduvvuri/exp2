package Calculator;
import java.io.*;

public class IoEx3
{
	public static void main(String[] args) throws Exception
	{
	long startTime=System.currentTimeMillis();
	IoEx3 ex=new IoEx3();
	ex.execute();
	long endTime=System.currentTimeMillis();
	long executionTime=endTime-startTime;
	System.out.println("execution Time= " +executionTime);
	}
	
	public void execute() throws Exception
	{
		InputStream is=null;
		OutputStream os=null;
		try
		{
		File inputFile=new File("C:\\Practice\\Test\\abcd.txt");
		//System.out.println("exists="+inputFile.exists());
		is =new FileInputStream(inputFile);
		File outFile=new File("C:\\Practice\\Test\\fish2");
		//File outFile=new File("C:/test/pqr");
		os =new FileOutputStream(outFile);
		int readBytesCount;
		byte[]buffer=new byte[1000];
		BufferedInputStream bis=new BufferedInputStream(is);
				//is=System.in;
			//int read;
			//while((readBytesCount=is.read())>=0)
			{
			//System.out.print(read);
			//os.write(buffer,0,readBytesCount);
			//System.out.write(readBytesCount);
			}
			while((readBytesCount=is.read(buffer))>=0)
			{
				os.write(buffer,0,readBytesCount);
			}
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	finally{
		if(is!=null) {
			is.close();
		}
		if(os!=null) {
			os.close();
		}
	}
}
}