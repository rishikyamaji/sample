package colllection;

public class Person {

	String name;
	int age;
    public Person(String name,int age)
    {
    	this.age=age;
    	this.name=name;
    }
	
	public String toString(){
		return this.name + " "+this.age;
	}
		
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
		
	}
	
	
}
