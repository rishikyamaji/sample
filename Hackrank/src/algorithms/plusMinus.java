package algorithms;

import java.util.Scanner;

public class plusMinus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int countMinus=0,countPlus=0,countZero=0;
       
        
        for(int count=0;count<n;count++)
        {
        	if(arr[count]<0)
        	{
        		countMinus++;
        	}else
        		
        	if(arr[count]==0)
        	{
        		countZero++;
        	}
        	else
        		
        	if(arr[count]>0)
        	{
        		countPlus++;
        	}
        }
        System.out.println((double)countPlus/n);
        System.out.println((double)countMinus/n);
        System.out.println((double)countZero/n);

}
}