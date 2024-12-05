package homework5;
// Connor Hatalla-Scrambling
public class Coffee_Homework5 
{
	
//adding variables
	private String name;
	private int caffeineCont;
	
	//picking default  values 
	public Coffee_Homework5() 
	{
		this.name = "none"; //coffee name
		this.caffeineCont = 50;         // caffeine content 50mg
	}

	public Coffee_Homework5(String name, int caffeineCont) 
	{
		setName(name);
		setCaffeineCont(caffeineCont);
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name != null) //doing this to make sure the name is not nulll
		{
			this.name = name;
		}
	}

	public int getCaffeineCont()
	{
		return caffeineCont;
	}

	public void setCaffeineCont(int caffeineCont)
	{
		if (caffeineCont >= 50 && caffeineCont <= 300)
		{
			this.caffeineCont = caffeineCont;
		}
	}

	public double riskyAmount()
	{
		return 180.0 / ((caffeineCont / 100.0) * 6.0);
	}

	public boolean equals(Coffee_Homework5 other)
	{
		return this.name.equals(other.name) && this.caffeineCont == other.caffeineCont;
	}

	public String toString()
	{
		return "name: " + name + "\nCaffeine Amount: " + caffeineCont;
	}
}


















