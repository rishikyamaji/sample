package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SuperReducedString {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		String s=sn.nextLine();
	StringBuilder sb=new StringBuilder(s);
	
	int	n=sb.length();
		for(int i=0;i<n;i++)
		{
			try{
				if(sb.charAt(i)==sb.charAt(i+1))
				{
					sb.deleteCharAt(i);
					sb.deleteCharAt(i);
					n=n-2;	
				}
			}catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("");
			}
			
		}
		System.out.println(sb.toString());

	}

}
