package emnumaration;
class ExampleEnum {

	public enum Months{january,february,march,
	april,
	may,
	june,
	july,
	august,
	september,
	october,
	november,
	december;
	
	public static Months getEnum(String s){
		for(Months m:Months.values()){
			if(s.equals(m.name())){
				return m;
			}
		}
		return null;
	}
}
	
 
public static void main(String args[])
{

		if(Months.getEnum("Monday") != null){
			System.out.println("Monday valid");
		}
		if(Months.getEnum("march") != null){
			System.out.println("March valid");
		}
System.err.println("you made a wrong enrty");

}
}

