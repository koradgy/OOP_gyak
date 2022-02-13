package tomb;

public class Main {

	public static void main(String[] args) {
		int[] array = {2,4,6,7,8,9,10,1,3,5};
		array_print(array);
		System.out.println("\n");
		array_print_reversed(array);
		System.out.println("\n");
		avgEven(array);
		System.out.println("The lowest number in the array: "+array[minindex(array)]);
		if(Is_monotone_growing(array))
		{
			System.out.println("the array is monotone growing");
		}
		else
			System.out.println("the array is not monotone growing");
		sort(array);
		System.out.println("the array after sorting:");
		array_print(array);
		

	}
	public static void array_print(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static void array_print_reversed(int[] array)
	{
		for(int i = array.length-1; i >= 0; i--)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static void avgEven(int[] array)
	{
		double avg = 0;
		double even = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 == 0)
			{
				avg += array[i];
				even ++;
			}
		}
		avg /= even;
		System.out.println("avg of even numbers: "+avg);
	}
	
	public static int minindex(int[] array)
	{
		int index=0;
		int min = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static boolean Is_monotone_growing(int[] array)
	{
		boolean ok = false;
		for(int i = 0; i < array.length - 1; i++)
		{
			if(array[i] < array[i+1])
			{
				ok = true;
			}
			else {
				ok = false;
				break;
			}
			
		}
		return ok;
	}
	public static void sort(int[] array)
	{
		for(int i = array.length - 1; i > 0; i--)
		{
			int min = array[i];
			int index = i;
			
			for(int j = 0; j < i; j++)
			{
				if(min < array[j])
				{
					min = array[j];
					index = j;
				}
			}
			int tmp = array[i];
			array[i] = array[index];
			array[index] = tmp;
		}
	}

}