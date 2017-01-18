import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<int[]> array=new ArrayList<>();
		Scanner sn= new Scanner(System.in);
		int n=sn.nextInt();
		int outPut=0;
		for(int i=0;i<n;i++)
		{   

			int m=sn.nextInt();
			int[] arrayTemp =new int[m];
			for(int k=0;k<m;k++)
			{
				arrayTemp[k]=sn.nextInt();
			}
			array.add(arrayTemp);
		}

		for(int[] arr:array) 
		{
			System.out.println(Arrays.toString(arr));
		}

		int q=sn.nextInt();
		for(int x=0;x<q;x++)
		{

			int temp1=sn.nextInt();
			int temp2=sn.nextInt();
			int[] temp3=array.get(temp1);
			try{

				outPut=temp3[temp2];
				System.out.println(outPut);
			}catch(IndexOutOfBoundsException e)
			{
				System.out.println("ERROR!");
			}


		}

		}

	}
