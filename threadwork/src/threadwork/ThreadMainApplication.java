package threadwork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ThreadMainApplication {
	public static void main(String[] args) throws InterruptedException {
		FileOutputStream fout = null;
		try {
			fout=new FileOutputStream("sruthi.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(fout != null){
			ThreadFile t1=new ThreadFile("rahul.txt",fout);
			ThreadFile t2=new ThreadFile("rishi.txt", fout);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("Program ended");
		}
	}
}
