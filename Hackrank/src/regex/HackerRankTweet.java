package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTweet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		   int n=sn.nextInt();
		   sn.nextLine();
		   int count=0;
		   for(int i=0;i<n;i++)
		   {
			   String s=sn.nextLine();
			   Pattern p=Pattern.compile("^.*(hackerrank).*$");
			   Matcher m=p.matcher(s);
			   if(m.find())
			   {
				   count++;
				   
			   }
		   }
		   System.out.println(count);
	   }
	}


