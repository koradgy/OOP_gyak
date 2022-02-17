package gyakorlat;

import java.util.Scanner;

public class Main2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int arrSize = read(1,15);
		String[] array = new String[arrSize];
		readNames(array);
		printNames(array);
		String search = read();
		if(isInArray(array, search))
		{
			System.out.println("benne van");
		}
		else
			System.out.println("nincs benne");
		

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
	 public static void readNames(String[] names)
	 {
		 for(int i = 0 ; i < names.length; i++)
		 {
			 System.out.println("name #"+(i + 1)+":");
			 names[i] = in.nextLine();
		 }
	 }
	 public static void printNames(String[] names)
	 {
		 for(String name : names)
		 {
			 System.out.println(name);
		 }
	 }
	 
	 public static boolean isInArray(String[] array, String key)
	 {
		 for(String name : array)
		 {
			 if(name.equals(key))
			 {
				 return true;
			 }
		 }
		 return false;
	 }
}
