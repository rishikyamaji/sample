package algorithms;

public class PdfView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int n = 26;
	        int h[] = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        char[] chars=word.toCharArray();
	        int height=0,highheight=0;
	      for(int i=0;i<chars.length;i++)
	      {
	    	 int temp=chars[i]-97;
	    	  height=h[temp];
	    	  if(height>highheight)
	    	  {
	    		  height=highheight;
	    	  }
	      }
	      int size=highheight*chars.length;
	      
	}

}
