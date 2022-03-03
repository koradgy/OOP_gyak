package elso;

public class Main {

	public static void main(String[] args) {
	/*	employee emp = new employee("V.Béla",420);
		System.out.println(emp.getName()+" Salary: "+ emp.getSalary());
		
		emp.incSalary(246);
		System.out.println(emp);
		
		employee emp2 = new employee("S. Oszkár", 590);
		employee emp3 = new employee("aranka", 69);
		System.out.println(emp.compare(emp2));
		*/
		
        employee[] emps = { new employee("Levente Fazekas", 100), new employee("Baksa Erika Varga", 150),
                new employee("Charles Heavy", 450), new employee("Balage Bolyki", 10),
                new employee("Laszlo Smid", 120) };
        
        print(emps);
        System.out.println("Max: "+emps[gethighest(emps)]);
		
	}
	public static void print(employee[] emps)
	{
		for(employee emp: emps)
		{
			System.out.println(emp);
		}
	}
	
	public static int gethighest(employee[] emps)
	{
		int max = 0;
		for(int i = 0; i < emps.length; i++)
		{
			if(emps[i].compare(emps[max]));
			max = i;
		}
		
		return max;
	}

}
