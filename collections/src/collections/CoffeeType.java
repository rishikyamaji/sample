package collections;

public enum CoffeeType {
	Espresso(7,0),
	Latte(7,227),
	
	FilterCoffee(10,0);
	
	private final int requiredbeans;
	private final int requiredmilk;
	CoffeeType(int requiredbeans,int requiredmilk)
	{
		this.requiredbeans=requiredbeans;
	this.requiredmilk	= requiredmilk;	
	}

	public int requiredbeans(){
		return requiredbeans;
		
	}
	public int requiredmilk(){
		return requiredmilk;
	}
	
}

