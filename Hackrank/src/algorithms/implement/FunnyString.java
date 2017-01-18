package algorithms.implement;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sn=new Scanner(System.in);
      int n=sn.nextInt();
      sn.nextLine();
      for(int testcase=0;testcase<n;testcase++)
      {
    	  String s=sn.nextLine();
    	  StringBuilder sb=new StringBuilder(s);
    	  StringBuilder reversal=sb.reverse();
    	  System.out.println();
    	  int count=0;
    	  for(int i=0;i<sb.length();i++)
    	  {
    		try{
    		  if(((int)sb.charAt(i)-(int)sb.charAt(i+1)==(int)reversal.charAt(i)-(int)reversal.charAt(i+1)))
    		  {
    			  System.out.println((char)reversal.charAt(i)+""+(char)reversal.charAt(i+1));
    			  count++;
    		  }
    		}catch(StringIndexOutOfBoundsException e)
    		{System.out.printf("");}
    	  }
    	  System.out.println(count);
      }
	}

}
