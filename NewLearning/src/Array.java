
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=5;
		int[] number= new int[10];
		for(int i=0;i<6;i++)
		{
			number[i]=++k;
			System.out.println(number[i]);
		}
		String[] colors =new String[]{"red","blue","green"};
		
		for(String currentcolor :colors)
		{
			System.out.println(currentcolor);
		}
		
			
		
		
		number[0]=1;
		number[1]=0;
		System.out.println(++number[0]+ number[1]);
		
		

	}

}
