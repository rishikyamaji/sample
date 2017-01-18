import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p= Pattern.compile("t|T+.*[0-9]+[s][0-9]*");
		Matcher m=p.matcher("hgfhg T$1s1 T$fhgdhg1s gfdgd");
		boolean b=m.matches();
		System.out.println(b);
		System.out.println(m.groupCount());

	}

}
