import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int length = sc.nextInt();
	    int total =0;
	    int[] arr = new int[100];

	    for(int i=0;i<length;i++){
	        arr[i] = sc.nextInt();
	    }       
	    for(int start=0;start<length;start++){

	         for(int end=start+1;end<length+1;end++){       

	            int[] newArr = Arrays.copyOfRange(arr,start,end);

	            int sum = 0;                  
	            for(int k=0; k < newArr.length;k++){
	                sum += newArr[k];                  
	            }
	            //System.out.printf("%s=%d%n",Arrays.toString(newArr),sum);
	            if (sum < 0){
	                total++;                    
	            }
	        }
	    }        
	    System.out.println(total);;
	}
}
