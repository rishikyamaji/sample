package inheritence;

public class Rectangle extends Shape {
int length;
int breath;
int area;
int parameter;

  int area(int length,int breath)
{
	area=length*breath;
	return area;

}
  int parameter(int length,int breath)
  {
	 parameter=2*(length*breath);
	return parameter;
	  
  }
  @Override
  void draw() {
  	// TODO Auto-generated method stub
  	
  	 System.out.println("you created rectangle");
  }
}