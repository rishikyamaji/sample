import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Testfile {

	public static void main(String args[]) throws IOException{  
		     
		     FileOutputStream fout=new FileOutputStream("rishi.txt");  
		     String s="i am rishi good morning";  
		     
		     String k="  this is very wonderful right   "+ "\n";
		     
		     byte b[]=s.getBytes();
		     byte a[]=k.getBytes();
		     
		     //converting string into byte array  
		     fout.write(b);
		     fout.write(a);
		   
		   
		     System.out.println("success...");  
		     
		     FileInputStream  fin=new FileInputStream("filework.txt");
		       
		             int i=0;
		             
		             
		           while ((i=fin.read())!=-1)
		          System.out.println((char)i);
		    
		
		} 
}




