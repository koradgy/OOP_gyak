package Calculator;

import java.util.*;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double a = readInt();
		
		char muv = readChar();
		
		double b = readInt();

	}
	
	public static double readInt() 
	{
		System.out.println("adjon meg egy számot");
        double number = 0;
        boolean ok = false;
        do {
            ok = true;
            while (!input.hasNextInt()) {
                ok = false;
                input.next();
            }
            number = input.nextInt();
        } while (!ok);

        return number;
    }
	
	
	public static char readChar() 
	{
		char inp;
		boolean ok;
        do {
            ok = true;
            System.out.println("Adja meg az operátort");
            inp = input.next().charAt(0);
            
            if(inp != '+' || inp != '-' || inp != '*' || inp != '/')
            {
            	ok = false;
            	System.out.println("hibás input!");
            	input.next();
            }   
        } while (!ok);

        return inp;
    }
}
