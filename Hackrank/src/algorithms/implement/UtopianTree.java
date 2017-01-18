package algorithms.implement;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int n=sn.nextInt();
		int result=1;
		for(int i=0;i<n;i++)
		{
			int test=sn.nextInt();
			if(test==0)
			{
				System.out.println(1);
			}

			else
			{
				for(int k=1;k<=test;k++)
				{
					if(k%2!=0)
					{
                       result=result*2;
					}
					else{
						  result=result+1;
					}
				}

			}
			if(test>0)
			{System.out.println(result);}
			result=1;
		}
      
	
	}

}
