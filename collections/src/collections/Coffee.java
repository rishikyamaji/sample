package collections;

public class Coffee {

	
	private final CoffeType coffeetype;
	private final int beans;
	private final int milk;
	
	public Coffee(CoffeeType coffeetype,int beans,int milk)
	{
		this.type=coffeetype;
		this.beans=beans;
		this.milk=milk;
	}
	
	public void CoffeType  gettype()
	{
		return type;
		
	}
	public int getbeans()
	{
		return beans;
		
	}
	
	public int getmiklk()
	{
		return milk;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "coffee{"+type+"\t"+beans+milk+"}";
	}
	
	
	
}

	
	
	
	
	
