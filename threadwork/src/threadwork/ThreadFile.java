package threadwork;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class ThreadFile extends Thread{

	private String fileName;
	private FileOutputStream fout;

	ThreadFile(String fileName,FileOutputStream fout){
		this.fileName = fileName;
		this.fout=fout;
	}

	public void run(){
		try{  
			FileInputStream fin=new FileInputStream(this.fileName);  
			InputStreamReader isr = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(isr);
			int i=0;
			
			String s1	=br.readLine();
			String[] words=s1.split("\\s");
			for(int s=0;s<words.length;s++)
			{
				String word = words[s];
				int count=0;
				boolean isPalindrome = false;
				for(int m=0;m<word.length()/2;m++)
				{
					if(word.charAt(m)==word.charAt(word.length()-(m+1)))
					{
						count++;
						if(count==word.length()/2)
						{
							isPalindrome = true;
						}	

					}
				}
				
				if(isPalindrome){
					byte b[]=word.getBytes();
					byte k[]=" \t".getBytes();
					fout.write(b);
					fout.write(k);
				}
			}
			System.out.println(words[1]);

			fin.close();  

		}catch(Exception e){System.out.println(e);}  
	} 

}
