package gimWillson.variable.datatypes.String;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj1= new StringJoiner("],[ ","[","]");
		sj1.add("rishi");
		sj1.add("rahul");
		System.out.println(sj1);
		StringJoiner s2=new StringJoiner(",","{","}");
		s2.add("rahul").add("sruthi");
		System.out.println(s2);
		//edge and corner cases 
		StringJoiner s3=new StringJoiner("");
		s3.setEmptyValue("i am emppty");
		System.out.println(s3);
		StringJoiner s4 = new StringJoiner("");
		s4.setEmptyValue("EMPTY");
		System.out.println(s4);
		StringJoiner s5= new StringJoiner("");
		s5.setEmptyValue("EMPTY");
		s5.add("rishi");
		System.out.println(s5);
		sj1.merge(s2);
		System.out.println(sj1);
		s2.merge(sj1);
		System.out.println(s2);
		s2.add(" laxmi prasad mamaduru");
		System.out.println(s2);
		
		
		
		
		

	}

}
