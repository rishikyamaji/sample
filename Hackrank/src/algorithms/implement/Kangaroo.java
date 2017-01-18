package algorithms.implement;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(v1<v2)
        {
        	System.out.println("NO");
        	
        }
        else
        {
        	int d=x2-x1;
        	int v=v1-v2;
        	if((d+v2)%v1==0)
        	{
        		System.out.println("yes");
        	}
        	else
        	{
        		System.out.println("No");
        	}
        }
    }
}
