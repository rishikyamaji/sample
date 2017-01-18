package colllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> message=Arrays.asList("rishi","rahul","nikhil","sruthi");
		System.out.println(message);
		System.out.println(message.contains("srija"));
		System.out.println(message.get(0));
		System.out.println(message.size());
		
//		message.add(5,"teja");
		Person rishi=new Person("rishi",24);
		Person nikhil=new Person("nikhil",22);
		List<Person> kyamaji=new ArrayList<Person>();
	kyamaji.add(nikhil);
	kyamaji.add(rishi);
	System.out.println(kyamaji);
	    Person rahul =new Person("rahul",28 );
	    Person teja =new Person("teja", 13);
	    kyamaji.add(rahul);
	    kyamaji.add(nikhil);
	    System.out.println(kyamaji);
	    kyamaji.add(new Person("srija",18));
	    kyamaji.add(teja);
	    System.out.println(kyamaji);
	    System.out.println(kyamaji.remove(0));
	    System.out.println(kyamaji.add(nikhil));
	    System.out.println(kyamaji);
	    Collections.sort(kyamaji, new AgeCompare());
	    System.out.println(kyamaji);
	    
	
	
		
		
		
		
		

	}

}
