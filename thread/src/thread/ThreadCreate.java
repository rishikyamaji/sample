package thread;

public class ThreadCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Runnable runnable=()->{
//    	  System.out.println("i am running in "+Thread.currentThread().getName());
//      };
//      Thread t = new Thread(runnable);
//      t.setName("rishi");
//      t.start();
//     // t.run();no no dont use it
//      
        Thread t=Thread.currentThread();
        t.setName("MainThread");
        System.out.println("Name of thread is "+t);
       
      
	}

}
