package java8.lambda;

public class lambdaRunnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Runnable runnable =new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i=0;i<3;i++)
//				{
//					System.out.println("my first lambda "+Thread.currentThread().getName());
//				}
//				
//			}
//		};
                Runnable runnablelambda=() ->
                {
                for(int i=0;i<3;i++)
				{
					System.out.println("my first lambda "+Thread.currentThread().getName());
				}
                };
		Thread t= new Thread(runnablelambda);
		t.start();
		t.join();
	}

}
