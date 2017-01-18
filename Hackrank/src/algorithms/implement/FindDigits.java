package algorithms.implement;

import java.util.Arrays;
import java.util.Scanner;

public class FindDigits {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int original=n;
		String s=Integer.toString(n);
		int[] temp=new int[s.length()];
		int count=0;
		for(int i=0;i<n;i++)
		{
			int number=sn.nextInt();

			while(number>0) 
			{
				int x=0;
				temp[x]=number%10;
				if(original%temp[x]==0)
				{count++;}
				number=number/10;
				System.out.println(temp[x]);
				x++;
			}
		}
		System.out.println(count);
	}
}
