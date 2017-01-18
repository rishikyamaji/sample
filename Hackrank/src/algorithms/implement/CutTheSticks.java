package algorithms.implement;

import java.util.ArrayList;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		int entriesNo=sn.nextInt();
		ArrayList<Integer> array=new ArrayList<>();
		for(int i=0;i<entriesNo;i++)
		{
			array.add(sn.nextInt());
		}

		System.out.println(array.size());
		for(int w=0;w<array.size();w++)
		{
			array.sort(null);
			int temp= array.get(0);
			for(int x=0;x<array.size();x++)
			{

				int temp2=array.get(x)-temp;
				array.set(x, temp2);
				if(array.get(x)==0)
				{
					array.remove(x);
				}

			}
			System.out.println(array.size());

		}

		
	}


}


