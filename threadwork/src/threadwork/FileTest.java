package threadwork;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	
	    public static void main(String args[]) throws IOException {
	    	FileReader fr=null;
	    	FileWriter fw=null;
	    
	      try {
	           fr=new FileReader("rishi.txt");
	           fw=new FileWriter("sruthi.txt");
	          int c=fr.read();
	          while(c!=-1) {
	            fw.write(c);
	          }
	      } catch(IOException e) {
	          System.out.println(e);
	      } finally {
	            fr.close();
	            fw.close();
	      
	      }
	    }
	
}
