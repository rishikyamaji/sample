package algorithms.implement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualizeAnArray2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n =sn.nextInt();
		int[] array=new int[n];
		int count=0;

		HashMap<Integer, Integer> repetitions = new HashMap<Integer, Integer>();

		  for (int i = 0; i < array.length; ++i) {
			  array[i]=sn.nextInt();
		      int item = array[i];

		      if (repetitions.containsKey(item))
		          repetitions.put(item, repetitions.get(item) + 1);
		      else
		          repetitions.put(item, 1);
		  }
		  int max=0;
		  for (Map.Entry<Integer, Integer> e : repetitions.entrySet()) {
			  
		      if (e.getValue() > max) 
		      {
		    	  max=e.getValue();
		    	  
		      }
		      
		  }
		  System.out.println(array.length-max);

	}

}
