package java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import  java.util.function.*;

public class Comparelambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Comparator<String> comp =new Comparator<String>() {
//
//		@Override
//		public int compare(String o1, String o2) {
//			// TODO Auto-generated method stub
//			return Integer.compare(o1.length(), o2.length());
//		}
//	};
	Comparator<String> comp=(String o1, String o2)->
		Integer.compare(o1.length(), o2.length());
	
	
	List<String> list=Arrays.asList("***","*","*****","**","****");
	Collections.sort(list,comp);
	for(String s:list)
	{
		System.out.println(s);
	}
	Comparator<Integer> c=Integer::compare;//new way of writing lambdaexpressions
	List<Integer> l=Arrays.asList(1,6,5,4,7);
	Collections.sort(l,c);
//	for(Integer i:l)
//	{
//		System.out.println(i);
//	}
	l.forEach(Integer->System.out.println(Integer));
	l.forEach(System.out::println);
	}
	
	

}
