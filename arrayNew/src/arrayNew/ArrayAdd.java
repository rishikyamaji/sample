package arrayNew;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAdd {

	int c=0;

	@SuppressWarnings("null")
	public static void main(String[] args)throws NullPointerException {
		// TODO Auto-generated method stub

		ArrayAdd aa = new ArrayAdd();
		Scanner sn =new Scanner(System.in);
		int[ ]  result =new int[30];
		int count=1;
		int temp=0;
		int arc=0;

		System.out.println("enter the array length you need to insert:");
		int arl=sn.nextInt();
		int[] array=new int[30];
		System.out.println("enter the array elements :");
		for(int i=0;i<arl;i++)
		{
			array[i]=sn.nextInt();
		}

		for(int k=0;k<array.length;k++)
		{
			temp=0;
			for(int m=0;m<count&&aa.c!=arl;m++,aa.c++)
			{
				temp+=array[aa.c];
				if( array[k]==array[arl-1]&&aa.c==arl)
				{
					result[arc]=array[k];
				}

			}
			count++;
			result[arc]=temp;
			arc++;	  
		}
		System.out.println(Arrays.toString(result));
	}
}
