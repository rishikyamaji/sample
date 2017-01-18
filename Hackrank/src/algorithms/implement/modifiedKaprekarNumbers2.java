package algorithms.implement;

import java.util.Scanner;

public class modifiedKaprekarNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
	     int  first=sn.nextInt();
		 int  last=sn.nextInt();
		 int count=0;
		for( int i=first;i<last;i++)
		{ 
		 int original=i;
		 int temp=(int) Math.pow(i, 2);
		 String s=Integer.toString(temp);
		 int pow=s.length()/2;
		 int x1=(int) (temp%Math.pow(10, pow));
		 int x2=(int) (temp/Math.pow(10, pow));
		 int sum=x1+x2;
		 if(sum==original)
		 {
			 System.out.println(original);
			 count++;
		 }
		
		}
		if(count==0)
		{System.out.println("INVALID RANGE.");}
	}

}
