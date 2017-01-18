package colllection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Workmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person rahul =new Person("rahul",28	);
		Person nikhil =new Person("nikhil",22);
		Map<String ,Person> kyamaji= new HashMap<>();
		
		kyamaji.put(rahul.getname(), rahul);
		kyamaji.put(nikhil.getname(), nikhil);
		System.out.println(kyamaji.entrySet());
		Collections.sort(kyamaji));
		

	}

}
