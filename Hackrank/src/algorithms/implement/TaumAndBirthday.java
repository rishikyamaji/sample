package algorithms.implement;

import java.util.Scanner;

public class TaumAndBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long sum=0;
            if(x==z&&y==z)
            {
            	x=x;
            	y=y;
            }
            else
            	if(x>z&&y+z<x)
            	{
            		x=y+z;
            		y=y;
            	}
            	else
            		if(y>z&&x+z<y)
            		{
            			y=x+z;
            			x=x;
            		}
            sum= ((b*x)+(w*y));
            System.out.println(sum);
        }

	}

}
