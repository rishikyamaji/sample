package java8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ownlambda {
	
	public interface Rishi{
		public void print(String message);
		
	}
//	Consumer< String> s= new Consumer<String>() {
//
//		@Override
//		public void accept(String t) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public Consumer<String> andThen(Consumer<? super String> after) {
//			// TODO Auto-generated method stub
//			return Consumer.super.andThen(after);
//		}
//		
//	};
//      Function<T, R> f= new Function<T, R>() {
//
//		@Override
//		public R apply(T t) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	};
               
	
	final static String salutation = "Hello! ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Rishi r=message->System.out.println(message+salutation);
        r.print("rishi ");
        
        Function<String, String> f = s -> s.toLowerCase();
        String m=f.apply("Rishi KESH");
        System.out.println(m);
        
  
        Consumer< String> t=System.out::println;
        t.accept("rishi");
        Predicate<String> p=s1->s1.length()<10;
       System.out.println( p.test("rishi"));
       
       
       
       Consumer<String> s1=(message)->
       System.out.println(message);
       s1.accept("rishi");
       Consumer< Integer> s2=
    		   System.out::println;
       s2.accept(123);
       
       Consumer<String> s3=(message)->{
  String result =  message.join("  ", "rishi ","rahul","sruthi","nikhil");
     System.out.println(result);
   
       };
       s3.accept("family");
       Consumer< Integer> int1=(integer)->
       {
    	   int result=  Integer.SIZE;
     System.out.println(result);
       };
   int1.accept(123);
     
    		   
    		   
      
        
       
       
       
	}

}
