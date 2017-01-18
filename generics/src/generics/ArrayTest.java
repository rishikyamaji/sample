package generics;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
         String  k="abcdefghijklmnopqrstuvwxyz";
         
         char[] ch =k.toCharArray();
         
         int[] temp =new int[26];
         
         int[] sort =new int[26];
         
         for(int i=0;i<=25;i++)
         {
        	 temp[i] =(int) ch[i];
         
         
         
        	 
		 System.out.println( "alphabet position"  +"\t" +ch[i]  +"\t"+ (temp[i]-96));
		 
		 sort[i]=temp[i]-96;
		 
         }
         System.out.println(Arrays.toString(sort));
         
		 
         
		 
	}

}
