import java.util.Arrays;
import java.util.Scanner;

public class BigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        Arrays.sort( s,0,n);
        System.out.println(s[1]);
        for(int i=0;i<n;i++)
        {
     	     s[i]=s[n-(1+i)];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
      	sc.close();
	}

}
