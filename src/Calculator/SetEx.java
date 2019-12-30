package Calculator;
import java.util.*;

public class SetEx {
public static void main(String[] args)
{
	Employee e1=new Employee(1,"Ram", 3000);
	Employee e2=new Employee(2,"Yan", 3000);
	//boolean same=e1==e2;
	//System.out.println("e1 and e2 are same "+same);
	//boolean equals=e1.equals(e2);
	//System.out.println("e1 equals e2 "+equals);
	Employee e3=new Employee(3,"Sam",6000);
	Employee e4=new Employee(4,"Tam",7000);
	Set set= new LinkedHashSet();
	boolean added=set.add(e1);
	boolean equal=e1.equals(e2);
	Set<Employee> set= new LinkedHashSet();
	//set.add(e1);
	set.add(e2);
	set.add(e3);
	set.add(e4);
	int size=set.size();
	System.out.println("size="+size);
	boolean contains=set.contains(e2);
	System.out.println("set contains e2 "+contains);
	SetEx ex=new SetEx();
	ex.print(set);
	boolean removed=set.remove(e2);
	System.out.println("removed e2 "+removed);
	ex.print(set);
}
//public void print(Set set)
public void print(Set<Employee> set)
{
	//for(Object o:set)
	for(Employee e:set)
	{
		//Employee e=(Employee)o;
		System.out.println(e.getId()+" "+e.getName());
	}
}}