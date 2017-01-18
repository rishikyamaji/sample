package algorithms.implement;

import java.util.Scanner;

public class NondivisibleSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sn= new Scanner(System.in);
       int n=sn.nextInt();
       int k=sn.nextInt();
       
       int count=0;
       int[] array=new int[n];
       for(int i=0;i<n;i++)
       {
    	   int temp=(int)k/2;
           int temp2=temp;
    	  array[i]=sn.nextInt();
    	  if(array[i]%k<=temp2&&array[i]%k!=0)
    	  {
    		 count++; 
    	  }
       }
       System.out.println(count);
	}

}
