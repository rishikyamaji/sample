package threadwork;

import java.io.FileInputStream;

public class NewThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread t1=new NewThread(){
			public void run(){
				try{  
				    FileInputStream fin=new FileInputStream("rishi.txt");  
				    int i=0;  
				    while((i=fin.read())!=-1){  
				     char c=(char)i;
				   String  s=  Character.toString(c);
				   System.out.println(s);
				    } 
				    
				    fin.close();  
				  }catch(Exception e){System.out.println(e);}  
				 } 
		};
		NewThread t2=new NewThread(){
			public void run(){
				try{  
				    FileInputStream fin=new FileInputStream("rahul.txt");  
				    int i=0;  
				    while((i=fin.read())!=-1){  
				     char c=(char)i;
				   String  s=  Character.toString(c);
				   System.out.println(s);
				    } 
				    
				    fin.close();  
				  }catch(Exception e){System.out.println(e);}  
				 } 
		};
		
	}
	
	public void run()
	{
		t1.start();
	}
}
