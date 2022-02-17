package gyakorlat;
import java.util.*;

 
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int n = read(1,1000);
		printPrime(n, 10);

	}
	
	public static int GCD(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		return GCD(b, a%b);
	}
	
    public static int read(int min, int max)
    {
        int number = 0;
        do {
            System.out.println("Give me a number between " + min + " and " + max + "!");
            while (!in.hasNextInt()) {
                System.out.println("Bad input format!");
                in.next();
            }
            number = in.nextInt();
        } while (number < min || number > max);
        return number;
    }
    
    public static void printPrime(int n, int start)
    {
    	 int rprimeCnt = 0;
         while (rprimeCnt < n) {
             for (int i = 2; i < start; i++) {
                 if (GCD(start,i) == 1) {
                     System.out.println("first: " + i + " second: " + start);
                     rprimeCnt++;
                     if (rprimeCnt >= n)
                         break;
                 }
             }
             start++;
         }
    }
}
