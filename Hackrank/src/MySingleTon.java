import java.util.Scanner;



public class MySingleTon {
    
    private static MySingleTon myObj;
    /**
     * Create private constructor
     */
    private MySingleTon(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();
        }
        return myObj;
    }
     
    public void getSomeThing(String s){
       
        System.out.println("Hello I am a singleton! Let me say " +s +" to you");
    }
     
    public static void main(String a[]){
        MySingleTon st = MySingleTon.getInstance();
        Scanner sn=new Scanner(System.in);
        String s =sn.nextLine();
        st.getSomeThing(s);
    }
}
