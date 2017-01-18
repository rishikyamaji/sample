package algorithms.implement;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sn=new Scanner(System.in);
        String message=sn.nextLine();
        
            String sos = "SOS";
            int count = 0;
            for (int i = 0; i < message.length(); i++) {
                if (message.charAt(i) != sos.charAt(i % 3)) count++;
            }
            
        System.out.println(count);
	}

}
