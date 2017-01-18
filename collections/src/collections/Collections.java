package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product door =new Product("door",35);
		Product chair=new Product("chair",25);
		Product window=new Product("window",15);
		Collection< Product> products=new ArrayList<>();
		products.add(door);
		products.add(chair);
		products.add(window);
		System.out.println(products);
		System.out.println(products.size());
		System.out.println();
		//mapping
		Stream<Product> prdct=products.stream();
		prdct.forEach(p->System.out.println(p));
		System.out.println("  ");
		//filtering
		Stream<Product> stream=products.stream();
		Stream<Product> filtered=stream.filter(person->person.getweight()<20);
		filtered.forEach(x->System.out.println(x));
		
//	    final Iterator<Product> p= products.iterator();
//	    {
//	    	
//	        
//	    	while(p.hasNext())
//	    	{
//	    		Product product=p.next();
//	    	
//	    		if(product.getweight()>20)
//	    		{
//	    			System.out.println(product );
//	    		}
//	    		else
//	    			p.remove();//this what iterator do more than foreach
////	    		SYSTEM.OUT.PRINTLN("\N");
//	    	}
//	    	System.out.println("\n");
//	    }
//	    for(Product p1:products)//if we looping over the collection with the foreach do not modify it
//	    	                    //remove() add() things
//	    { 
//	    	System.out.println(p1);
//	    }
//	   System.out.println( products.isEmpty());
//	   System.out.println(products.contains(door));
}

}
