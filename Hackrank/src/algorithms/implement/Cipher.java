package algorithms.implement;

import java.util.Arrays;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sn =new Scanner(System.in);
      int n=sn.nextInt();
      sn.nextLine();
      String s=sn.nextLine();
      char[] charArray=s.toCharArray();
      int cipherKey=sn.nextInt();
      for(int i=0;i<n;i++)
      {  
    	  if(charArray[i]!='-')
    	  {charArray[i]=(char)(((int)charArray[i])+2);}
      }
      String cipher=String.copyValueOf(charArray);
      System.out.println(cipher);
      
	}

}
