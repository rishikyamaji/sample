package inheritence;

public class Triangle extends Shape{
 
	
	int height;
	int a,b,c,parameter;
	double area;
	int base;
	double area(int base,int height)
	{
		area=( base *height)/2;
		return area;
	}
	int parameter(int a ,int b,int c)
	{
		parameter=a+b+c;
		return parameter;
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
	
		 System.out.println("you created a triangle");
	}
}
