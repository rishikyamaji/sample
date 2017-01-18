package gimWillson.variable.datatypes;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=100;//here internally 
		Integer k=Integer.valueOf(100);
	      if(i.equals(k))
	      {
	    	  System.out.println("they are equal");
	      }
	      System.out.println(i.byteValue());
	      System.out.println(Integer.MAX_VALUE);
	      System.out.println(Integer.MIN_VALUE);
	      System.out.println(i.doubleValue());
	      System.out.println(i.floatValue());
	      System.out.println(Integer.BYTES);
	      System.out.println(Integer.SIZE);//it gives the number of bits the integer occupy
	      System.out.println(Integer.max(6, 9));
	      System.out.println(Integer.sum(10, 50));
	      System.out.println(Integer.signum(10));
	      System.out.println(Integer.reverse(i));
	      System.out.println(Integer.numberOfLeadingZeros(i));
	      System.out.println(Integer.reverseBytes(i));
	      System.out.println(Integer.compare(30,30 ));
	      //wrapper class equality
	     Integer temp1=4*2;
	     Integer temp2=2*2*2;
	     if(temp1==temp2)//normally we use equal for comparison
	     {
	    	 System.out.println("they are equal because they are refering to same instance");
	    	 //in java -128 to +127
	    	 //all int byte short equal values refer to the same instance
	    	 //in char \u0000 to\u00ff
	    	 //boolean true and false
	     }
		int inttype=10;
		Integer wrap=inttype;
	
		Integer wrap2=wrap.intValue();
		String s="200";
		Integer StringtoInt =Integer.parseInt(s);
		System.out.println(StringtoInt);
		

	}

}
