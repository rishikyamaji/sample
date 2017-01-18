import java.util.Arrays;
import java.util.Scanner;


public class ReadaArray {
	public static int [] readNumsFromCommandLine() {

		Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine(); // throw away the newline.

        int [] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }
        }

        return numbers;
    }


public static void main(String[] args) {
    int[] numbers = readNumsFromCommandLine();
    System.out.println(Arrays.toString(numbers));
    if(numbers.length>=1)
    {
    	
     
   int[] g=new int[numbers.length];

  
	for(int k=numbers.length-1,i=0;k>=0;--k,++i)
	{
		g[i]=numbers[k];

	}
	

   
	System.out.println(Arrays.toString(g));
	
	int sum =0;
	for(int k=0;k<=g.length-1;++k)
	{
		
		
		sum +=g[k];
	}
		System.out.println(sum);
		
		
		int count=0;
		int m=0;
		
		for(int s=0;s<=numbers.length-1;++s) {
			for(int k=0;k<=numbers.length-1;++k) {
				if(numbers[s]==numbers[k]&& s!=k)
				{
					++count;
					m=numbers[s];
				}
			}
			if(count != 0)
				break;
		}
		
		
		System.out.println("duplicate count:"+(count+1));
		System.out.println("duplicate num"+m);
    }
    
    
    
    
    
}
}
