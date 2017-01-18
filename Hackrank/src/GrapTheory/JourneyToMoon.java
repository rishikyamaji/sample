package GrapTheory;

import java.util.Arrays;
import java.util.Scanner;

public class JourneyToMoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int n=sn.nextInt();
		int[] array=new int[n];
		int i=sn.nextInt();
		for(int p=0;p<i*2;p++)
		{
			array[p]=sn.nextInt();
		}
	System.out.println(Arrays.asList(array).contains(0));
		int count=0;
		for(int x=0;x<n;x++,x++)
		{
			for(int y=x;y<x+2;y++)
			{
				for(int z=x+2;z<n;z++)
				{
					count++;
				}
			}
			
		}
  System.out.println(count);
 
	}

}
