package colllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Arrayinsr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("resource")
	Scanner sn = new Scanner(System.in);
      System.out.println("enter the arraylenth:");
       int arraylenth= sn.nextInt();
		int[] a=new int[arraylenth];
		System.out.println("enter the number in array:");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sn.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
	}

}
