package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		   int n=sn.nextInt();
		   for(int i=0;i<n;i++)
		   {

			   String str = sn.nextLine();           
        Pattern p = Pattern.compile("<a\\shref=\"([^\"]++)\"([^<>]*)>(<\\w>)*([^<>]*)<");
        Matcher m = p.matcher(str);
        while(m.find()){
        System.out.println(m.group(1));
        }
		   }
	}

}
