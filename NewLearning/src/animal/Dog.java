package animal;

public class Dog extends Animal {
      
	Dog(int legs) {
		super(legs);
		
		
	}


	public void describe()
	{
	

	System.out.println("this is dog with "+super.getLegs()+"legs");
	
	}
	
	
}
