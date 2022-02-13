package Formula;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Kérek egy számot");
		int n = input.nextInt();
		System.out.println("PI értéke "+ n +"-ig :"+PI_counter(n));
		
		System.out.println("e közelítve: " + e_Counter());
		
		input.close();

	}
	
	public static double PI_counter(int n)
	{
		double PI = 0;
		for(int i = 0; i < n ; i++)
		{
			
			if ((i % 2) == 0)
			{
				PI += 1.0 / (1.0 + i * 2.0);
			}
			else
			{
				PI -= 1.0 / (1.0 + i * 2.0);
			}
		}
		return PI *= 4.0;
	}
	
	public static double e_Counter()
	{
		double e = 2;
		
		for(int i = 2; i < 11; i++)
		{
			e += 1.0 / factorial(i);
		}
		
		return e;
	}
	
	public static int factorial(int num)
	{
		int fact = 1;
		
		for(int i = 1; i < num; i++)
		{
			fact *= num-i+1;
		}
		
		return fact;
	}

}
