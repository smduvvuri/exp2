package Calculator;
import java.io.File;

public class IOStreamEx {
	public static void main(String[] args)
	{
	String path="C:\\Practice\\Bank";
    File file=new File(path);
    boolean isDir=file.isDirectory();
    System.out.println("Is dir "+isDir);
    System.out.println("Is file "+file.isFile());
    System.out.println("Is hidden "+file.isHidden());
    if(isDir)
    {
    	String[] files=file.list(); //gives the list of all the files in the directory
    	for(String f:files)
    	{
    		System.out.println(f);
    	}
    }
    File dirToBeCreated=new File("C:\\Practice\\Test");
    boolean created=dirToBeCreated.mkdir();
    System.out.println("dir created "+created);
}
	}
