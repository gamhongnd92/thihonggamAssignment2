package thihonggamAssignment2;

public class Employee {
	private int id;
	private double salary;
	
	public Employee(int id, double salary)
	{
		this.id= id;
		this.salary = salary;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void set(double salary)
	{
		this.salary = salary;
	}
	public int getID()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}

}
