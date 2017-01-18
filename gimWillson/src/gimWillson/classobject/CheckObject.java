package gimWillson.classobject;

public class CheckObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Classobject ob1=new Classobject(2);//any constructor is created then the default constructor is not created by the jvm if we want a 
		Classobject ob2=new Classobject(3);
		Classobject temp=new Classobject();
		Classobject temp2=new Classobject();
		temp=temp2;//refering to same instance so they are equal if not then they are not equal and we need override the equal  methos of object class and 
		//            check for the equality of each and every member of to objects then only they are equal
		if(temp.equals(temp2))
		{
			System.out.println("they are equal");
		}
		
		ob1.addPassenger();
		ob1.addPassenger();
		ob1.setSeats(5);
		System.out.println(ob1.getSeats());
		System.out.println(ob1.passengers);
		
		ob1=ob2;//by doing this data memebers are not copied both are refering to same objecta that ob2
		System.out.println(ob1.passengers);
		//to make the exact copy we use clone() method of object class
		
	}

}
