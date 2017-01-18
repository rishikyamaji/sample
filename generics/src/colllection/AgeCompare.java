package colllection;

import java.util.Comparator;

public class AgeCompare implements  Comparator<Person> 
{

	@Override
	public int compare(Person left, Person right) {
		// TODO Auto-generated method stub
		return -1*Integer.compare(left.getage(),right.getage() );
	}
 
	
	
}
