package java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Arithmetic {
	   public static void main(String args[]){
		   StringJoiner sj=new StringJoiner(" " ,"{" ,"}");
		   sj.add("one").add("second").add("three");
		   String s2=String.join("  ","first","second","third");
		   String s=sj.toString();
		   System.out.println(s);
		   System.out.println(s2);
		   
		 
	   }
	}