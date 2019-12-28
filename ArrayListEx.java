package example;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(3);
		list.add(1);
		list.add(2);
		//Object o = list.get(0);
		//int firstElement = (int) o;
		// System.out.println(firstElement+"/n");
		ArrayListEx e = new ArrayListEx();
		e.print(list);
		//e.sortList(list);
		 //list.remove(2);
		//Object obj=3;
		 //list.remove(obj);
		//list.add(0, 6);
		//e.print(list);
		//int size=list.size();
		//System.out.println("Size= "+size);
		//boolean isEmpty=list.isEmpty();
		//System.out.println(isEmpty);
		//boolean isAdded=list.add(1);
		//System.out.println(isAdded);
		//e.printIterator(list);
		IntegerComparator comp=new IntegerComparator();
		list.sort(comp);
		e.print(list);
		
	}
public void printIterator(List list)
{
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		Object o=it.next();
		int num=(int)o;
		System.out.println("By iterator "+num);
		
	}
}
 //public void sortList(List list)
//{
	
//}
	public void print(List list) {
		for (Object o : list) {
			int num = (int) o;
			System.out.println(num);
		
		}
		System.out.println("\n");
	}

}