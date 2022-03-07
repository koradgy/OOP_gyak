package teglalap;

public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	
	public Teglalap(int a_oldal, int b_oldal) 
	{
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public Teglalap(int number)
	{
		a_oldal = number;
		b_oldal = number;
	}
	
	public int Terulet()
	{
		return a_oldal * b_oldal;
	}

	@Override
	public String toString() {
		return "Teglalap [a_oldal=" + a_oldal + ", b_oldal=" + b_oldal + ", Terulet()=" + Terulet() + "]";
	}

	public void setA_oldal(int a_oldal) {
		this.a_oldal = a_oldal;
	}

	public void setB_oldal(int b_oldal) {
		this.b_oldal = b_oldal;
	}
	
	public void setA_B(int number)
	{
		a_oldal = number;
		b_oldal = number;
	}
	
	public boolean Is_bigger(int terulet1, int terulet2)
	{
		
		if(terulet2 > terulet1)
		{
			return false;
		}
		else return true;
	}
	
	public int getA_oldal() {
		return a_oldal;
	}

	public int getB_oldal() {
		return b_oldal;
	}

	public boolean Is_equal_sided(int a, int b)
	{
		if(a == a_oldal && b == b_oldal)
		{
			return true;
		}
		else return false;
	}
	

}
