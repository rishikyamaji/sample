import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;


public class Dqueue {
	   public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           Deque deque = new ArrayDeque<>();

           HashSet<Integer> al=new HashSet<>();
           int n = in.nextInt();
           int m = in.nextInt();
          int[] array =new int[n];
           for (int i = 0; i < n; i++) {
               array[i] = in.nextInt();
              
           }
           int highSize=0;
           for(int i=0 ;i<n;i++,m++)
           {
        	   for(int j=0;j<m&&m<n;j++)
        	   {
        		   al.add(array[j]);
        	   }
        	   int size=al.size();
        	   if(size>highSize)
        	   {
        		   highSize=size;
        	   }
           }
           System.out.println(highSize);
       }
}
