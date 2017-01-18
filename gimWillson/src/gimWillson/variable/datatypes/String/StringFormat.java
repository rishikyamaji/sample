package gimWillson.variable.datatypes.String;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s=String.format("hi rishi what is your age %d" , 20);
        System.out.println(s);
        String s2=String.format("students ages like %d %.1f %d %d", 10,20.9600,30,40);
        System.out.println(s2);
        // "%d" for decimal
        // "%f"   for fractional
        //"%o"   for octal 
        // %x %X   for hexa
        //%s     for String 
        //e E   for Scientific notation
        //"#"  for radix
        //"0" for padding zero
        //"-" for left justify
        //","   normal representation
        String s3= String.format("i:%04d  j:%5d", 10,10000);
        String s4= String.format("k:%-5d   k:%05d", 10,10);
        System.out.println(s4);
        System.out.println(s3);
        System.out.println(String.format("%,d", 12345678));
        // "  " Space for positive numbers
        // "+"   to mention the sign every time
        // "("    to make the negative numbers in () 
       System.out.println(String.format("% d", -12));
       System.out.println(String.format("%+d", -12));
       System.out.println(String.format("%(d", -12));
        //ARGUMENT INDEX
       //"$index  for insert at particular place
       // "< "   to did the some formate on the previous value
       System.out.println(String.format("%04d %<05d %2d", 10,20,30));
       System.out.println(String.format("%3$d %1$d %2$d", 10,20,30));
       
        
	}
}
