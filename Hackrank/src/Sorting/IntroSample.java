package Sorting;

import java.util.Scanner;

public class IntroSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sn = new Scanner(System.in);
        int v=sn.nextInt();
        int n=sn.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
        	array[i]=sn.nextInt();
        	if(array[i]==v)
        	{
        		System.out.println(i);
        	}
        }
        
	}

}
