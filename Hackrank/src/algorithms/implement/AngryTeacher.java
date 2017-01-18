package algorithms.implement;

import java.util.Scanner;

public class AngryTeacher {
	public static void main(String[] args) {

          Scanner sn=new Scanner(System.in);
          int T=sn.nextInt();
          for(int testcount=0;testcount<T;testcount++)
          {
        	  int n=sn.nextInt();
        	  int k=sn.nextInt();
        	  int[] array=new int[n];
        	  int count=0;
        	  for(int i=0;i<n;i++)
        	  {
        		array[i]=sn.nextInt();
        		if(array[i]<=0)
        		{
        			count++;
        		}
        	  }
        	  if(count>=k)
        	  {
        		  System.out.println("NO");
        	  }
        	  else
        		  {System.out.println("YES");}
        	  count=0;
        	  
          }
          
	}
}
