package szemely;

public class Person {
	
	private String name;
	private double weight;
	private double height;
	
	
	public double TTI()
	{
		return weight /(height*height);
	}
	
	public String howFat(Person p)
	{
		if(p.TTI() < 18.5)
		{
			return "sov�ny";
		}
		else if(p.TTI() > 25)
		{
			return "k�v�r";
		}
		else{
			return "norm�l";
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + ", TTI()=" + TTI() + "]";
	}
	public Person(String name, double w, double height) {
		super();
		this.name = name;
		this.weight = w;
		this.height = height;
	}
	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	
	
}
