package Sorting;

import java.util.Scanner;

public class InsertionSort2 {


	public static void insertIntoSorted(int[] ar)  {
		// Fill up this function
		 int n=ar.length;
			int e=ar[0];		
			for(int  i=1 ;i<n;i++)
			{
			try{	
				if(ar[1]>e)
				{	
					ar[i-1]=ar[i-2];
					if(e<ar[0]&&i==2)
					{
						ar[0]=e;
					}
				}
	            else
				{
					ar[i-1]=e;
	               
				}
				printArray( ar);
	            if(ar[i-2]<e)
	            {  break;}
	                    }catch(ArrayIndexOutOfBoundsException ex)
	                      {
	                     System.out.println("");
	                     }
				
			}
	       
		}
       
	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertIntoSorted(ar);
	}


	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}


}

