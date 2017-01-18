package practicejava;

import java.util.Scanner;

public class Primecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] numbers = readNumsFromCommandLine();

		for(int i=0;i<numbers.length;i++)
		{
			
			if(isPrime(numbers[i])){
				System.out.println(numbers[i]+" is a prime number");
				sum +=numbers[i];
			}
		}	
		
		System.out.println(sum);
		
	}
	
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
	
	private static boolean isPrime(int num){
		if(num <=1)
			return false;
		for(int k=2;k<=num/2;k++)
		{
			
			if(num%k ==0)
			{
				return false;
			}
		}
		 return true;
	}

}
