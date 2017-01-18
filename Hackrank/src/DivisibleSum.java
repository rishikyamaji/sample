import java.util.Scanner;


public class DivisibleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int count=0;
	        for(int a1=0;a1<n-1;a1++)
	        {
	        	for(int b=1;b<n;b++)
	        	{
	        	   if(a[a1]+a[b]%3==0)
	        	   {
	        		   count++;
	        	   }
	        	}
	        }
	        System.out.println(count);

	}

}
