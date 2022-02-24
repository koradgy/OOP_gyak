package masodfoku;

import java.util.*;

public class Main {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		double a=0, b=0, c=0;
		boolean ok;
		do 
		{
		 System.out.print("Az egyenlet konstansai vesszõvel elválasztva: ");
		 String inString = input.nextLine();
		 String[] strArray = inString.split(",");
		 ok = true;
		 try 
		 {
			a = Double.parseDouble(strArray[0]);
			b = Double.parseDouble(strArray[1]);
			c = Double.parseDouble(strArray[2]);
		 }
		 catch (Exception e) 
		 {
			 ok = false;
		 }
		} while (!ok);
		
		System.out.println("a: "+a+" b: "+b+" c: "+c);
		double d = szamol(a,b,c);
		System.out.println("diszkrimináns = "+d);
		if(d > 0)
		{
			System.out.println("nem valós");
		}
		else if(d == 0)
		{
			double res = (-1.0 * b) / (2.0*a);
			System.out.println("eredmény :"+res);
		}
		else
		{
			double res1 = (-1.0 *b) - Math.sqrt(d);
			res1 /= 2.0 *a;
			double res2 = ( -1.0 *b) + Math.sqrt(d);
			res1 /= 2.0 *a;
			
			System.out.println("res1 ="+ res1 + " res2 ="+res2);
			
		}
		
	}
	public static double szamol(double a, double b, double c)
	{
		
		return Math.pow(b, 2) - (4* a* c);
	}

}
