package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ip4ip6 {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        Pattern ip4 = Pattern.compile("^(^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Pattern  ip6 = Pattern.compile("^([\\da-f]{1,4}:){7}[\\da-f]{1,4}$");
        while (count-- > 0){
            String line = sc.nextLine();
            Matcher m4 = ip4.matcher(line);
            Matcher m6 = ip6.matcher(line);
            if (m4.find())
                System.out.println("IPv4");
            else if (m6.find())
                System.out.println("IPv6");
            else 
                System.out.println("Neither");
        }
    }
}
