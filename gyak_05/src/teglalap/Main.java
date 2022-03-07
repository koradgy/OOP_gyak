package teglalap;
import java.util.*;
public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Teglalap a = new Teglalap(20,21);
		Teglalap b = new Teglalap(20,22);
		Teglalap c = a;
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		a.setA_oldal(30);
		a.setB_oldal(69);
		System.out.println("--------------------");
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		a.setA_oldal(20);
		a.setB_oldal(22);
		
		System.out.println("a = b "+ a.Is_bigger(a.Terulet(), b.Terulet()));
		System.out.println("a = c " + a.Is_bigger(a.Terulet(), c.Terulet()));
		
		System.out.println("a & b sidea are equal? " + a.Is_equal_sided(b.getA_oldal(), b.getB_oldal()));
		System.out.println("-------------------");
		Teglalap[] randonTegla = new Teglalap[10];
		randTL(randonTegla);
		printArray(randonTegla);
		System.out.println("-------------------");
		int sideA = readTl();
		int sideB = readTl();
		Teglalap XD = new Teglalap(sideA,sideB);
		System.out.println("number of bigger tégalalps: " + veryBig(XD, randonTegla));
		EQ_sided(XD, randonTegla);
		System.out.println("-------------------");
		
		Hanglemez h = new Hanglemez("69 Dollars", "yeeyee", 6);
		System.out.println(h);
		Hanglemez h2 = new Hanglemez("50 Cent","Ca$h Money",69);
		System.out.println(h2);
		System.out.println("h > h1 "+ h.hosszabb(h2.getHossz()));
		System.out.println(h.Is_igaz("béla"));
		System.out.println(h.Is_igaz("69 Dollars"));
		
	}
	
	public static void randTL(Teglalap array[])
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i] = new Teglalap(
			(int)(Math.random() * (10 - 2 + 1) + 2),
			(int)(Math.random() * (10 - 2 + 1) + 2));
		}
		
	}
	
	public static void printArray(Teglalap array[])
	{
		for(Teglalap elem : array)
		{
			System.out.println(elem.toString());
		}
	}
	public static int readTl()
	{
		boolean ok;
		int num;
		System.out.println("Give me an egész szám");
		do
		{
			ok = true;
			while(!input.hasNextInt())
			{
				ok = false;
				System.out.println("nem jó");
				input.next();
			}
			num = input.nextInt();
		}while(!ok);
		
		return num;
	}
	
	public static int veryBig(Teglalap t, Teglalap array[])
	{
		int cnt = 0;
		
		int t_size = t.Terulet();
		for(Teglalap elem : array)
		{
			if(elem.Terulet() > t_size)
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void EQ_sided(Teglalap t, Teglalap array[])
	{
		int i ;
		for(i = 0; i < array.length; i++)
		{
			if(t.Is_equal_sided(array[i].getA_oldal(), array[i].getB_oldal()))
			{
				System.out.println("the firts equal sided téglalap: "+ i);
				break;
			}
			if(i == array.length -1)
			{
				System.out.println("no téglalp is equal to this téglalap");
			}
		}
	}
}
