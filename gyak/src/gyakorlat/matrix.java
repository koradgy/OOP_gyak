package gyakorlat;

import java.util.Scanner;

public class matrix {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{67,70,71}}; 
		printMatrix(matrix);
		int num = read();
		if(isInMatrix(matrix, num))
		{
			System.out.println(num + " is in the matrix");
		}
		else
			System.out.println(num + " is not in the matrix");

	}
	public static void printMatrix(int[][] matrix)
	{
		for(int i = 0; i < matrix.length; i++)
		{
			System.out.print("|");
			for(int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("|");
		}
	}
	public static int read()
    {
        int number = 0;
        boolean ok = false;
        do {
        	ok = true;
            System.out.println("Give me a number!");
            while (!in.hasNextInt()) {
                System.out.println("Bad input format!");
                in.next();
                ok = false;
            }
            number = in.nextInt();
        } while (!ok);
        return number;
    }
	
	public static boolean isInMatrix(int[][] matrix, int num)
	{
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j < matrix[i].length; j++)
			{
				if(matrix[i][j] == num)
				{
					return true;
				}
			}
		}
		return false;
	}
}
