package Calculator;
import java.io.*;

public class IoStdEx {
	public static void main(String[] args)
	{
		IoStdEx ex=new IoStdEx();
		ex.execute();
	}
	public void execute()
	{
		InputStream is=null;
		OutputStream os=null;
		try {	
		
		is=System.in;
		int read;
		while((read=is.read())>=0)
		{
			System.out.write(read);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try{
				if(is!=null)
			{
				is.close();
			}
			if(os!=null)
			{
				os.close();
			}
		}
		catch(Exception e) {
			System.out.println("Could not close file");
		}
		finally {
			System.out.println("done");
		}
}}}

