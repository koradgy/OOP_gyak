package teglalap;

public class Hanglemez {

	private String eloado;
	private String cim;
	private int hossz;
	
	public Hanglemez(String eloado, String cim, int hossz) 
	{
		this.eloado = eloado;
		this.cim = cim;
		this.hossz = hossz;
	}

	@Override
	public String toString() {
		return "Hanglemez [eloado=" + eloado + ", cim=" + cim + ", hossz=" + hossz + " perc]";
	}
	
	public int hosszabb(int hossz)
	{
		if(this.hossz > hossz)
		{
			return 1;
		}
		else if(this.hossz < hossz)
		{
			return -1;
		}
		
		return 0;
	}
	
	public boolean Is_igaz(String name)
	{
		if(eloado.equals(name)) {
			return true;
		}
		return false;
	}

	public String getEloado() {
		return eloado;
	}

	public String getCim() {
		return cim;
	}

	public int getHossz() {
		return hossz;
	}

	
}
