
public class PensionPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
			landvalid(2);
		
		}
		catch(Exception m){System.err.println("exception:"+m);}
	
		try
		{
			
			agevalid(63);
		
		}
		catch(Exception m){System.err.println("exception:"+m);}
		
	}
	
public static void agevalid(int age)throws AgenNotExceedException
{
	if(age<65)
	{
		throw new  AgenNotExceedException("notvalid age, age restistiction should match");
	}
	else
	{
		System.out.println("welcome for pension");
	}
}
	public static void landvalid(int land)throws LandIncreasedExeception
	{
		if(land>3)
		{
			throw new  LandIncreasedExeception("notvalid land restriction exceeded");
		}
		else
		{
			System.out.println("welcome for pension");
		}

}
}