package inheritence;

public class Circle extends Shape{
	
	private int radius;
	private long area;
	private double perimeter;

	private static final double PAI=3.14;

	public	long area(int radius)
	{
		area=(long) (PAI*radius*radius);
		return area;
	}
	
	public	double parameter(int radius)
	{
		perimeter= (2*PAI*radius);
		return perimeter;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("you created a circle");
	}
}
