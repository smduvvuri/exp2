package Calculator;
import java.util.*;

public class EmployeeMain {
	public static void main(String[] args)
    {
		EmployeeMain mi=new EmployeeMain();
		mi.execute();
    }
	
		Map<Integer,Employee> store=new HashMap<>();
	    public void execute()
	    {
	    Employee e1=new Employee(1,"Sam",8000);
	    store.put(1,e1);
	    Manager m1=new Manager(2,"Yan", 9000);
	    store.put(2,m1);
	    m1.addManagedEmployee(e1);
	    print();
	    Employee fetched=findById(2);
	    System.out.println(fetched.getName());
	}
	    public Employee findById(int id)
	    {
	    	Employee e=store.get(id);
	    	return e;
	    }

	
	public void print()
	{
		Set<Integer> keys=store.keySet();
		for(Integer id: keys)
		{
			Employee e =store.get(id);
			System.out.println(e.getName()+" "+e.getId()+" "+e.getSalary());
			boolean isManager=e instanceof Manager;
			if(isManager) {
				Manager m= (Manager) e;
				System.out.println("Managed Employees by"+" "+e.getName());
				Employee[] managedemployees =m.getManagedEmployees();
				for(Employee managed: managedemployees)
				{
					if(managed!=null)
						{
						System.out.println(managed.getName()+" "+managed.getSalary());
						}
						}
				System.out.println("Remaining Employees:");
	
	}}}}
	