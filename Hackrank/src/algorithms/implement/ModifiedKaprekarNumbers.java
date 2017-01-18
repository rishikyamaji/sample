package algorithms.implement;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
	     int  first=sn.nextInt();
		 int  last=sn.nextInt();
		 int count=0;
		for( int i=first;i<last;i++)
		{
			int original=i;
			int  temp=(int) Math.pow(i, 2);
			int  sum1=0,sum2=0;
			while(temp!=0)
			{
				sum1+=temp%10;
				temp=temp/10;
			}
			while(original!=0)
			{
			   sum2+=original%10;
			   original=original/10;
			}
			if(sum2==sum1)
			{
				System.out.println(i);
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("");
		}
	}

}
