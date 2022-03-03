package szemely;
import java.util.*;

public class Main {
 static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		String name = readName();
		double w = readDouble();
		double h = readDouble();
		Person p = new Person(name, w, h);
		System.out.println(p+" "+p.howFat(p));

	}
	
	public static String readName()
	{
		String name;
		boolean ok;
		System.out.println("adja meg a nevet");
		do{
			ok = true;
			while(!input.hasNextLine())
			{
				ok = false;
				System.out.println("hiba van");
				input.next();
			}
			name = input.next();
			
		}while(!ok);
		return name;
	}
	
    public static double readDouble()
    {
        double number = 0;
        boolean ok;
        do {
        	ok = true;
            System.out.println("Adj egy számot !");
            while (!input.hasNextDouble()) {
            	ok = false;
                System.out.println("Hiba!");
                input.next();
            }
            number = input.nextInt();
        } while (!ok);
        return number;
    }
	

}
