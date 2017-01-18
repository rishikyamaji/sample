package algorithms.implement;

import java.util.Scanner;

public class AppendAndDelete {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int tempFirstCount=0,tempsecondCount=0;
        
        
        char[] first=s.toCharArray();
        char[] second=t.toCharArray();
        for(int i=0;true;i++)
        {
        	if(first[i]!=second[i])
        	{
        		tempFirstCount=first.length-i;
        		tempsecondCount=second.length-i;
        		System.out.println(tempFirstCount);
        		System.out.println(tempsecondCount);
        		break;
        		
        	}
        }
        if((tempFirstCount+tempsecondCount)==k)
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
    }
	
}
