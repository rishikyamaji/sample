package variable;



public class VariableScope {
   private static int age=25;
   
   public String mybro;
   public int mybroage;
   
   public void family()
   {
	   System.out.println(mybro+ "\t"+ mybroage);
   }
     public void family(String text)
     {
    	 System.out.println(text);
     }
     
     public String getfamily()
     {
    	 return mybro;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		number = 5;
	
		String secondname;
		   secondname ="kyamaji";
		String myname ="  rishi";
		{
			System.out.println(age+"\t");
			
		}
		String myage ="Myage";
		System.out.println(number);
		System.out.print(myname);
		System.out.println("\t"+secondname.indexOf('k') +secondname.length()+ "\n");
		System.out.println(myage +"\t"+ ++age);
	}
   
   
}
