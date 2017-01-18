import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Scanner in = new Scanner(System.in);
		      BigInteger n =new  BigInteger(in.next());
		      BigInteger temp1= BigInteger.valueOf(1);
		      BigInteger temp2= BigInteger.valueOf(0);

		      BigInteger k= BigInteger.valueOf(2);
		      BigInteger limit = n.divide(k);
		      BigInteger count= BigInteger.valueOf(0);
		      BigInteger j= BigInteger.valueOf(1);
		      for(BigInteger i= BigInteger.valueOf(2);i.equals(limit);i.add(j))
		      {
		    	 if( n.divideAndRemainder(i).equals(temp2))
		    	 {
		    		 count.add(temp1);
		    	 }
		    	  
		      }
		     if(count.equals(temp2))
		     {
		    	 System.out.println("prime");
		     }
		     else{
		    	 System.out.println("not prime");
		     }
		    	

	}

}
