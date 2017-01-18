package working.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseWork {

	
	 public static void main(String[] args) {
	 
	      Db db= new Db();
	      
	      db.select();
	      @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("please enter your option here to modify the table"+"\n");
	      System.out.print("to insert a row enter 1:"+"\n");
	     
	      System.out.print("to delete a row enter 2:"+"\n");
	      System.out.print("to select the rows enter 3:"+"\n");
	      int swth=scanner.nextInt();
	          checkswtch(swth);
	        
	      switch(swth)
	      {
	      
	      case 1:
	    	  System.out.print("eneter the  number of rows to you want to insert: " +"\n");
		      
	      
	          int number = scanner.nextInt();
	     
	           for(int i=0;i<=number;i++)
	           {
	    	  System.out.print("enter first name:");
	    	  String first_name = scanner.next();
	    	  System.out.print("enter last name :");
	    	  String last_name=scanner.next();
	    	 System.out.print("enter age :");
	    	 int age = scanner.nextInt();
	    	 System.out.print("enter address: ");
	    	 String address = scanner.next();
	    	 System.out.print("enter city: ");
	    	 String city = scanner.next();
	    	 System.out.print("enter state: ");
	    	 String state = scanner.next();
	    	 
	      
           db.insert(first_name,last_name,age,address,city,state);
	     }
	      break;
	      case 2: 			
	             System.out.print("by providing age you can delete corresponding row  enter age:");
    	          int age = scanner.nextInt();
                 db.delete(age);
                 db.select();
                 break;
	      case 3: 
	    	  System.out.println("enter the row  do you want to disply enter corresponding row age:+"+"\n"); 
	    	  int years= scanner.nextInt();
	            db.select(years);
	            break;
	            
	        default:System.err.println("you entered wrong key");    
          
          
         
          
	      }
	      
	      
		 
	 }

	private static void checkswtch(int swth) {
		try
		  {
		  if(swth<=0)
		  {
			  
		  }
		  }catch(IllegalArgumentException swth1) 
		  
		  {
			System.err.println("you given a wrong entry");  
		  }
	}
}


