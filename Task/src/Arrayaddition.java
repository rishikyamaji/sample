import java.util.Arrays;
import java.util.Scanner;


public class Arrayaddition {
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
        int k=1;
        int count=0;
        int[] g= new int[10];
        
        for(int i=0;i<=k&&k<numbers.length;i++)
        {
        	if(numbers.length<=2)
        		break;
        	++count;
        	++k;
        	int sum =0;
        	g[i]=numbers[i];
        	sum=numbers[count]+numbers[k];
        	g[count]=sum;
        	System.out.println(Arrays.toString(g));
        	
        	
        }
        System.out.println(Arrays.toString(numbers));
        
               
    }
}
	
	
        






