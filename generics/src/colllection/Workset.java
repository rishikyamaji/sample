package colllection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Workset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Person rahul =new Person("rahul",28	);
		Person nikhil =new Person("nikhil",22);
		Set<Person> kyamaji= new HashSet<Person>();
		
		kyamaji.add(nikhil);
		kyamaji.add(rahul);
		kyamaji.add(nikhil);
		kyamaji.add(rahul);
		System.out.println(kyamaji.size());
		System.out.println(kyamaji);

		
			
		
		
		
		
	

	
		
	}
}
