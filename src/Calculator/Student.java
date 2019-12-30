package Calculator;
import java.lang.*;
import java.util.Map;

public class Student {
	public Student(int id)
	{
		this.id=id;
	}
	private int id;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	Student s1=new Student(4);
	Student s2=new Student(6);
	@Override
	public boolean equals(Object obj)
	{
		if(obj==this)
		{
			return true;
		}
		if(obj==null || (obj instanceof Student))
		{
			return false;
		}
		Student s=(Student) obj;
		return s.id==this.id;	
	}
	@Override
	public int hashCode(Object obj)
	{
		 if(s1.hashCode() == s2.hashCode()) 
	        { 
	  
	            if(s1.equals(s2)) 
	                System.out.println("Both Objects equal"); 
	            else
	                System.out.println("Both Objects not equal"); 
	      return 1;
	        } 
	        else
	        System.out.println("Both Objects not equal");  
		 return 0;
		 
	}
	
			
		}
	}
}
