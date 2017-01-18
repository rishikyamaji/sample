package algorithms.implement;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sn= new Scanner(System.in);
       int n=sn.nextInt();
       BigInteger factorial=new BigInteger("1");
     while(n>1)
       {
    	 factorial=factorial.multiply( BigInteger.valueOf(n));
    	 n--;
       }
       System.out.println(factorial);
      
     sn.close();  
	}

}
