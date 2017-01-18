package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienUserName {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sn = new Scanner(System.in);
           int n=sn.nextInt();
          sn.nextLine();
          for(int i=0;i<n;i++)
              {
              String s=sn.nextLine();
              Pattern p=Pattern.compile("^(_|\\.)[0-9]+[a-zA-Z]*_?$");
              Matcher m=p.matcher(s);
              if(m.find())
              {
            	  System.out.println("VALID");
              } 
              else
            	  System.out.println("INVALID");
      
          }
    }
}
