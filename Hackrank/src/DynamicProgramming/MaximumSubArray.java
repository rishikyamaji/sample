package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sn= new Scanner(System.in);
        int T=sn.nextInt();
        
        for(int i=0;i<T;i++)
        {
        	int n=sn.nextInt();
        	int[] sum=new int[n];
        	  int sumMaxnoncon=0;
        	  int sumtemp=0;
        	int[] array=new int[n];
        	for(int k=0;k<n;k++)
        	{
        		array[k]=sn.nextInt();
        		
        	}
        	for(int p=0;p<n;p++)
        	{
        		sumtemp+=array[p];
        		sum[p]=sumtemp;
        	}
        	for(int q=0;q<n;q++)
        	{
        		if(array[q]>0)
        		{sumMaxnoncon+=array[q];}
        	}
        	
        	Arrays.sort(sum);
        	System.out.print(sum[n-1]+" ");
        	System.out.println(sumMaxnoncon);
        	
        }
	}

}
