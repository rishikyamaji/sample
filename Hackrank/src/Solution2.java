import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {
	
	
	public static void main(String[] args) throws ParseException {
		
		// TODO Auto-generated method stu
	        Scanner sn = new Scanner(System.in);
		  String s = sn.next();
		 
		  System.out.println( s.chars()
                  .distinct()
                  .count());
	sn.close();
	}		

}
