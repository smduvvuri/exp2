package Calculator;
import java.util.*;

public class StudentComparator implements Comparator<Student>{
	
		@Override
		public int compare(Student s1, Student s2)
		{
			if(s1.getId()>s2.getId())
				{return 1;}
			if(s2.getId()>s1.getId())
				{return -1;}
			return 0;
		}
	}
