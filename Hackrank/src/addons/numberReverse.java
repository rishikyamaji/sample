package addons;

import java.util.Scanner;

public class numberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		
		  int reverse=0;
		  int number=sn.nextInt();
		  while(number !=0)
		  {
			  reverse=reverse*10+number%10;
			  number=number/10;
		  }
		
		
		System.out.println(reverse );
		

	}

}
