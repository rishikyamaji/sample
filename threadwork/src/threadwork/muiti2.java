package threadwork;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Multi2 implements Runnable{ 
	
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }
	}

public static void main(String args[]){  
Multi2 m=new Multi2();  
//Thread t1=new Thread(m);
//t1.start();
   ExecutorService ex=Executors.newFixedThreadPool(5);
   ex.submit(m);
   ex.submit(m);
   ex.submit(m);
   ex.submit(m);
   ex.submit(m);
   ex.submit(m);

}

}  
