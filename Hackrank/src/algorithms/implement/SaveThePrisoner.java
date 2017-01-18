package algorithms.implement;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int testCases=sn.nextInt();
		int temp=0;
		for(int testcase=1;testcase<=testCases;testcase++)
		{
			int n=sn.nextInt();
			int m=sn.nextInt();
			int S=sn.nextInt();
			int count=0;
		
			for(int i=S;i<=m&&i<n;i++,n++)
			{
				count++;
				if(count==n-1)
				{
					i=1;
				}
				if(count==m)
				{
					temp=i;
				}
			}
			System.out.println(temp);
		     temp=0;
		}
      
	}

}
