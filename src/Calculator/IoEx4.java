package Calculator;
import java.io.*;

public class IoEx4 {
	public static void main(String[] args) throws Exception
	{
		IoEx4 gg=new IoEx4();
		gg.execute();
	}
	public void execute() throws Exception
	{
		InputStreamReader reader=null;
		OutputStreamWriter writer=null;
		try
		{
			reader=new InputStreamReader(System.in);
			writer=new OutputStreamWriter(System.out);
			int read;
			while((read=reader.read())>=0)
			{
				writer.write(read);
				writer.flush();
				char ch=(char)read;
				if(ch=='z') {
					break;
				}
			}
		}
	catch (IOException e)
	{
		e.printStackTrace();
	}
		
	finally{
			
		if(reader!=null) {
			reader.close();
		}
		if(writer!=null) {
			writer.close();
	}
}}}
