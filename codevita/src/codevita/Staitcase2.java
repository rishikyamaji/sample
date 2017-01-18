package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class Staitcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sn=new Scanner(System.in);
           int n=sn.nextInt();
           int k=sn.nextInt();
           int[] arrayA=new int[n];
           int[] arrayB=new int[n];
           
           int[] rishi=new int[n];
           int[] rahul=new int[n];
           for(int i=0;i<n;i++)
           {
        	   arrayA[i]=sn.nextInt();
        	   rishi[i]=arrayA[i];
           }
           for(int j=0;j<n;j++)
           {
        	   arrayB[j]=sn.nextInt();
        	   rahul[j]=arrayB[j];
        	   
           }
           int arrayBhigh=0;
           int temp2=0;
           for(int j=0;j<n;j++)
           {
        	   if(arrayB[j]>arrayBhigh)
        	   {
        		   arrayBhigh=arrayB[j];
        		   temp2=j;
        	   }
        	   
           }
           
          int lowSum=0;
          int temp=0;
          int sum=0;
          int minimumSum=0;
          for(int x=0;x<n;x++)
          {
        	  if(arrayA[x]>0)
        	  {
        		arrayA[x] =arrayA[x]-k*2; 
        		
        	  }
        	  else
        	  {
        		  arrayA[x] =arrayA[x]+k*2;   
        	  }
        	  sum=arrayA[x]*arrayB[x];
        	  
        	  if(sum<=lowSum)
        	  {
        		 
        		  lowSum=sum;
        		  temp=x;
        		  if(sum==lowSum)
        		  {
        		  if(arrayB[temp]<arrayB[temp2])
        		  {
        			  lowSum=sum;
            		  temp=x;  
        		  }
        		  }
        		  
        	  }
          }
         for(int p=0;p<n;p++)
         {
        	 if(p==temp)
        	 {
        		 if(rishi[p]>0)
           	  {
           		rishi[p] =rishi[p]-k*2; 
           	  }
        		 else
           	  {
           		  rishi[p] =rishi[p]+k*2;   
           	  } 
        	 }
        	 minimumSum+=rishi[p]*rahul[p];
        	
        	 
         }
       System.out.println(minimumSum);    
	}

}
