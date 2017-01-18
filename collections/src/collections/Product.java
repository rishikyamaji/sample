package collections;

public class Product {
private final String name;
 private final int weight;
	
	public Product(String name,int weight )
	{
		this.name=name;
		this.weight=weight;
		
	}
	public String getname()
	{
		return name;
		
	}
	public int getweight()
	{
		return weight;
	}
	public String toString()
	{
		return "product{name:"+name +"  " +"weight:"+weight +"}";
		
	}
}


