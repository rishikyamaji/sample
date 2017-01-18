package algorithms.implement;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn= new Scanner(System.in);
     int n =sn.nextInt();
     for(int i=0;i<n ;i++)
     { 
    	 int count=0;
    	 int first=sn.nextInt();
    	 int second=sn.nextInt();
    	 for(int x=first;x<=second;x++)
    	 {
    		 double sqrt = Math.sqrt(x);
    		 int temp= (int) sqrt;
    		 if(Math.pow(sqrt,2) == Math.pow(temp,2))
    		 {
    			 count++;
    		 }
    		     
    	 }
    	 System.out.println(count);
     }
	}

}
