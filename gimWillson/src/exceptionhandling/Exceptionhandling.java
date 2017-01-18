package exceptionhandling;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i=10;
			int result=i/0;
		}catch (ArithmeticException e) {
			// TODO: handle exception
		System.out.println(e);
		}

	}

}
