package egy;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[10];
		feltolt(array, 1 ,50);
		printArr(array);
		System.out.println("a legnagyobb páros szám: "+legnagyobbParos(array));
		System.out.println("Négyzetszámok száma a tömbben: "+squareNums(array));
		System.out.println("Mértani átlag: "+Gavg(array));
		
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int index = Arrays.binarySearch(array, 10);
		if(index >= 0)
		{
			System.out.println("10 benne van");
		}
		else
			System.out.println("10 nincs benne");
		
		int[] rand = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("array == rand array: "+Arrays.equals(array, rand));
		
	}
	
	public static void feltolt(int[] array,int min, int max)
	{
		for(int i =0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * (max - min +1))+1; 
		}
	}
	public static void printArr(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i +" ");
		}
		System.out.println();
	}
	
	public static int legnagyobbParos(int[] arr)
	{
		int max = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				if(arr[i] > max)
				{
					max = arr[i];
				}
			}
		}
		return max;
	}
	public static int squareNums(int[] array)
	{
		int cnt = 0;
		for(int i : array)
		{
			double sq = Math.sqrt(i);
			if(sq == (int)sq)
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static double Gavg(int[] array)
	{
		double avg = 1;
		for(int elem : array)
		{
			avg *= elem;
		}
		return Math.pow(avg, 1.0 / (double)array.length);
	}
}
