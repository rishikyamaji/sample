package algorithms;

import java.util.Scanner;

public class BonAppetite {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      Scanner sn =new Scanner(System.in);
	      int n =sn.nextInt();
	      int k=sn.nextInt();
	      int[] array=new int[n];
	      for(int i=0 ;i<n;i++)
	      {
	    		array[i]=sn.nextInt();  
	      }
	      array[k]=0;
	      int sum=0;
	      for(int i=0 ;i<n;i++)
	      {
	    	sum+=array[i];  
	      }
	      int temp=sum/2;
	      int falseChange=sn.nextInt();
	      System.out.println(falseChange-temp);
    }
}
