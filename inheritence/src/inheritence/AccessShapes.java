package inheritence;

public class AccessShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Shape sh=new Circle();
	 sh.draw();
	System.out.println(((Circle) sh).area(12));
	System.out.println(((Circle) sh).parameter(12));

	
	Shape sh1=new Rectangle();
	Shape sh2=new Triangle();
	((Rectangle) sh1).draw();
	System.out.println(((Rectangle) sh1).area(12,12));
	System.out.println(((Rectangle) sh1).parameter(12,12));
	((Triangle) sh2).draw();
	System.out.println(((Triangle) sh2).area(12,12));
	System.out.println(((Triangle) sh2).parameter(4, 5, 6));
	
	
	}

}
