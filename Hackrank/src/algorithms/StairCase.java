package algorithms;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sn= new Scanner(System.in);
       int n = sn.nextInt();
       for(int i=1;i<=n;i++)
       { 
    	   for(int k=i;k<n;k++)
    	   {
    		   System.out.print(" ");  
    	   }
    	   for(int m=1;m<=i;m++)
    	   {
    	   System.out.print("#");
    	   }
    	   System.out.println("\n");
       }
       sn.close();
	}

}
