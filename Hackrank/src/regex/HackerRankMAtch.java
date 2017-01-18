package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankMAtch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int n= sn.nextInt();
		sn.nextLine();
		for(int i=0;i<n;i++)
		{
			String s=sn.nextLine();
			Pattern hr1=Pattern.compile("^(hackerrank).*$");
			Pattern hr2=Pattern.compile(".*(?=hackerrank)");
			Pattern hr3=Pattern.compile("(?<=hackerrank).*(?=hackerrank)");
			Matcher m1=hr1.matcher(s);
			Matcher m2=hr2.matcher(s);
			Matcher m3=hr2.matcher(s);
			if(m1.find())
			{
				System.out.println(1);
			}
			else
				if(m2.find())
				{
					System.out.println(2);
				}
				else if(m3.find())
				{
					System.out.println(0);
				}
				else
				{
					System.out.println(-1);
				}
		}

	}

}
