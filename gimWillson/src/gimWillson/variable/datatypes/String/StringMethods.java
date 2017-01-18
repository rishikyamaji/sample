package gimWillson.variable.datatypes.String;

import java.util.Locale;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String stringTemp="rishi";
		 s +=" ";
		 s +="world ";//the jvm create a new object "s" that hello world   the original hello is like that in string constant pool 
		 s +="hi";
		 System.out.println(s);
		 s="rishi";
		
		 System.out.println(s);
		 String sappend=s.concat(" kesh");//to concat the new string
		 System.out.println(sappend);
		 System.out.println(s);
		System.out.println( s.charAt(0));//to get the char at particular index
		System.out.println(s.substring(0, 2));//for substring
		System.out.println(s.compareTo(s));//lexicographically compare
		System.out.println(s.length());//to now the length of the string in terms of charecters White Space also considered as a charecter
		System.out.println(s.trim().length());//to trim the white spaces
		System.out.println(s.endsWith("shi"));//to know the string ends with substring or not
		System.out.println(s.contains("ri"));//to know string contain particular string r not
		System.out.println(s.startsWith("  "));//to know weather string Start with particular subString or not
		System.out.println(s.indexOf(' '));//print the index of that charecter
		System.out.println(s.intern());//?
		System.out.println(s.toCharArray());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toLowerCase());//learn about locale
		char[] ch =s.toCharArray();
		String copyString =s.copyValueOf(ch, 0, 4);
		                
		System.out.println(copyString);
		System.out.println(s.valueOf(1));
		System.out.println(s.join(" ", "rishi","rao","kyamaji"));
	
		System.out.println(s.split("\\s"));//it is used to split the String with given regex
		System.out.println(s.getClass());
		System.out.println(s.replace('i', 'k'));//in replace we have many variations
		System.out.println(s.hashCode());
		String stemp= "rishi";
		String stemp2=stemp.intern();
		if(stemp==stemp2)
		{
			System.out.println("they are same");
		}
		//stemp and stemp2 refering to same string that is rishi
		
		
/*
 in String class we have  s.conact() s.equals() s.size() s.charAt()  s.substing
 */

	}

}
