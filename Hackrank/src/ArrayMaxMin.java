import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn =new Scanner(System.in);
		int[] array=new int[5];
		  for(int i=0;i<5;i++)
		  {
			  array[i]=sn.nextInt();
		  }
		  int[] sum=new int[5];
		  int arraySum=0;
		  int temp=0;
		  int min,max;
		  for(int k=0;k<5;k++)
		  {
			  for(int j=0;j<5;j++)
			  {
				 if(k==j)
				 {
					temp=array[j]; 
					array[j]=0;
				 }
				 arraySum+= array[j];
				 if(k==j){
				 array[j]=temp; 
				 }
			  }
			  sum[k]=arraySum;
			  arraySum=0;
			  
			  
		  }
		  Arrays.sort(sum);
		  max =sum[sum.length-1];
		  min=sum[0];
		  System.out.println(min+" "+max);
 	}

}
