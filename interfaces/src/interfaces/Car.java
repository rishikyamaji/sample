package interfaces;

public class Car implements Vehicle,Onroad {

	@Override
	public void tiers(int x) {
		// TODO Auto-generated method stub
		
	System.out.println("you created car has " + x + " " +"tiers");
		
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		
	}
	
	public void name()
	{
		System.out.println("you creat a car");
		
	}



public static void main(String[] args) {
	
	Car c =new Car();
	c.name();
	c.tiers(4);
	
}

@Override
public void road() {
	// TODO Auto-generated method stub
	
}

}	
