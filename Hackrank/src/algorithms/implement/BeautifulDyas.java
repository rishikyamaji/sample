package algorithms.implement;

import java.util.Scanner;

public class BeautifulDyas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int start=sn.nextInt();
		int end=sn.nextInt();
		int key=sn.nextInt();
		int count=0;
		for(int eachday=start;eachday<=end;eachday++)
		{
			int reverse=0;
			  int number=eachday;
			  while(number !=0)
			  {
				  reverse=reverse*10+number%10;
				  number=number/10;
			  }
			  
			  int ageDifference=eachday-reverse;
			  System.out.println(ageDifference);
			  if(ageDifference==0)
			  {count++;}
			  else
				  
			  if((ageDifference%key)==0)
			  {
				  count++;
				  
			  }
		
		}
		System.out.println(count);
	}

}
