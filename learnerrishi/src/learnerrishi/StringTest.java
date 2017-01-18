package learnerrishi;
import static java.lang.System.*;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rishi";
		StringBuilder b=new StringBuilder(s);
		out.println(b);
		out.println(s);
	int a=s.indexOf('i');
	System.out.println(a);
	  
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Ratan";  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		  
		

	}

}
