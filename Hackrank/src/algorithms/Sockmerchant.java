package algorithms;

import java.util.Scanner;

public class Sockmerchant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int array[] = new int[n];
		for(int c_i=0; c_i < n; c_i++){
			array[c_i] = in.nextInt();
		}
		int repeatingCount=0;
		int sockCount=0;
		int count=0;
		for(int i=0;i<n;i++)
		{    
			repeatingCount=0;
			for(int k=0;k<n;k++)
			{
				if(array[i]==array[k]&&array[k]!=0)
				{
					repeatingCount++;
					array[k]=0;
				}
							
			}
			 
				 System.out.println(repeatingCount);
			    sockCount+=repeatingCount/2;  
		
			
		}
		System.out.println(sockCount);
	}
}
