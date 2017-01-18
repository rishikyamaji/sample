package compete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Tailor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		int n= sn.nextInt();
		List<Integer> a=new ArrayList<>();
		int[] distinctArray= new int[n];
		int price=sn.nextInt();
		for(int k=0;k<n;k++)
		{
			int minimumPrice=sn.nextInt();
			for(int i=1;true;i++)
			{
				if(!a.contains(i))
				{ 
					System.out.println(!a.contains(i)+ ""+ price*i);
					if(minimumPrice<=(price*i))
					{
						distinctArray[k]=i;
						a.add(i);
						break;
					}

				}
			}
		}
		System.out.println(Arrays.toString(distinctArray));
		long sum=0;
		
		for(int x=0;x<n;x++)
		{
			sum+=distinctArray[x];
		}
		int sum1 = IntStream.of(distinctArray).sum();
		int sum2 = a.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}

}
