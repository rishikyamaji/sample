package gimWillson.variable.datatypes.String;

public class StringBuildermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//frequently used methods are append() and insert()
		StringBuilder sbr= new StringBuilder("rishi");
		System.out.println(sbr.append("  kesh"));//to append
		System.out.println(sbr.capacity());//?
		System.out.println(sbr.indexOf("e"));//to know the index
		System.out.println(sbr.lastIndexOf("h"));//to know the last index of the specific String
		System.out.println(sbr.reverse());//to reverese the string
		System.out.println(sbr.delete(9, 10));
		System.out.println(sbr);
		System.out.println(sbr.insert(1, "k"));
		StringBuilder build= new StringBuilder();
		System.out.println(build.capacity());//gives the initial capacity
		build.append("rishi");
		build.append(" born in");
		build.append("  1992");
		System.out.println(build);
		build.insert(14, "year");
		System.out.println(build);
	
		
		

	}

}
