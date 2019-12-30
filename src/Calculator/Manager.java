package Calculator;

public class Manager extends Employee{
	private int i=0;
	private Employee ManagedEmployees[]=new Employee[2];
	public Employee[] getManagedEmployees()
	{
		return ManagedEmployees;
	}
	public Manager(int id, String name, double salary) {
		super(id, name, salary);}
	
	public void addManagedEmployee(Employee e)
	{
		ManagedEmployees[i]=e;
		i++;
	}
	}
