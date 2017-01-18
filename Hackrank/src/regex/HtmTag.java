package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmTag {
	public static void main(String args[])
	   {
		   Scanner sn = new Scanner(System.in);
		   int n=sn.nextInt();
		   for(int i=0;i<n;i++)
		   {
			   String s=sn.nextLine();
			   Pattern p=Pattern.compile("<\\s*([^\\s/>]+)[^>]*?(>.*?</\\1>|(?<=/)>)");
			   Matcher m=p.matcher(s);
			   if(m.find())
			   {
				   System.out.println(s);
			   }
		   }
	   }
}
