package Calculator;
import java.util.*;

public class MapEx {
	public static void main(String[] args)
	{
		Map<Integer,Employee> map=new TreeMap<> (new EmployeeKeyComparator());
		Employee e1=new Employee(1,"Ram", 3000);
		Employee e2=new Employee(2,"Sam", 4000);
		Employee e3=new Employee(3,"Tam", 5000);
		map.put(1,e1);
		map.put(2,e2);
		map.put(3,e3);
		Employee fetched1=map.get(1);
		Employee fetched2=map.get(2);
		//System.out.println(fetched1);
		MapEx ep=new MapEx();
		ep.printByKeys(map);
		//map.remove(2);
		ep.printByValues(map);
		ep.printByEntries(map);
	}
	public void printByKeys(Map<Integer, Employee> map) {
		Set<Integer> keys=map.keySet();
		for(int key:keys)
		{
			Employee value=map.get(key);
			System.out.println(value.getName());
		}
	}
	public void printByEntries(Map<Integer, Employee>map) {
		Set<Map.Entry<Integer, Employee>>entries=map.entrySet();
		for(Map.Entry<Integer,Employee>entry:entries)
		{
			int key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println(value.getName());}}
	
	public void printByValues(Map<Integer, Employee> Map)
	{
		Collection<Employee>values=Map.values();
		for(Employee e:values)
			System.out.println(e.getName());
		
			}
}
