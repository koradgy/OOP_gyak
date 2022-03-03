package elso;

import javax.print.attribute.standard.MediaSize.Other;

public class employee {
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	public employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void incSalary(int num)
	{
		salary+=num;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", salary= " + salary + "tax: "+getTax()+"]";
	}
	
	public boolean isSalaryInRange(int min, int max)
	{
		return salary >= min && salary <= max;
	}
	
	public int getTax()
	{
		return (int)(salary * 0.16);
	}
	
	public boolean compare(employee empl)
	{
		return salary > empl.salary;
	}

	
}
