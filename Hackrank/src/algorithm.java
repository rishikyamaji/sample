
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class algorithm {

    public static void main(String[] args) {
    	
       Scanner sn =new Scanner(System.in);
       
        BigInteger a=BigInteger.valueOf(sn.nextLong());
        BigInteger b=BigInteger.valueOf(sn.nextLong());
        
     System.out.printf("%d \n",a.add(b));  
        System.out.printf("%d",a.multiply(b));
        sn.close();
    }
    	            
}
