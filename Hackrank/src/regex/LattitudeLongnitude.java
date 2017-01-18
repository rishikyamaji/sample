package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LattitudeLongnitude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sn =new Scanner(System.in);
        int n=sn.nextInt();
        sn.nextLine();
         for(int i=0;i<n;i++)
         {
        	 String s=sn.nextLine();
        	 Pattern p=Pattern.compile("^\\("+"((+|-)?[0-9][0-9]\\.[0-9]*),"+"((+-)?[01]?[0-9].[0-9]*)+"\\)$")
        	 Matcher m=p.matcher(s);
        	 if(m.find())
        	 {
        		 System.out.println(s);
        	 }
         }
        }

}
