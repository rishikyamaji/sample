package algorithms.implement;

import java.util.Scanner;

public class manasaAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
	     int  testCases=sn.nextInt();
		 
		for( int i=0;i<testCases;i++)
		{
			int  n=sn.nextInt();
			int first=sn.nextInt();
			int second=sn.nextInt();
			int sum=0;
			int p=n;
			int q=1;
			for(int x=p,y=q;x>1||y<=n;x--,y++)
			{
				sum=0;
				for(int a1=1;a1<x;a1++){
					sum+=first;
				}
				for(int a2=1;a2<y;a2++){
					sum+=second;
				}
				System.out.print(sum+" ");
			}
			
		}
	}

}
