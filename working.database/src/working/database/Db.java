package working.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
	private Connection connection;
	
	public Connection getDatabaseConnection(){
		if(connection != null)
			return connection;
		
		try{
		 connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM",
					"rishi123");
	      System.out.println("connection successfully established");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return connection;
	}
	      
	   
	 public void insert(String x,String y,int z,String p,String q,String r)
	 {  
		 Statement st=null;
		 try{
		 st=getDatabaseConnection().createStatement();
	   st.executeUpdate("insert into  RS_1992( FIRST,LAST,age,address,city,state)values('"+x+"','"+y+"',"+z+",'"+p+"','"+q+"','"+r+"')" );
	   System.out.println("one row inserted");
		 }catch(Exception ex){
			 ex.printStackTrace();
		 }
		
	 }  
	 
	 public void select(){
		 Statement st=null;
		 try{
			 st=getDatabaseConnection().createStatement();
	   ResultSet rs =st.executeQuery("select * from rs_1992 ");
	   System.out.print("available table:"+"\n");
	   while(rs.next())
	   {
	   System.out.println(rs.getInt("age") +"\t"+rs.getString("last")+"\t"+ rs.getString("first") + "\t"+rs.getString("address")+"\t"+ rs.getString("city")+ "\t"+rs.getString("state"));	
	   }
	 
		 }catch(Exception ex){
			 ex.printStackTrace();
			 
		 }
	 }
	 public void delete(int age){
		 Statement st=null;
		 try{
			 st=getDatabaseConnection().createStatement();
	   st.executeUpdate("delete from rs_1992  where age="+age+"");
	  
		 } catch(Exception ex){
			 ex.printStackTrace();
			 
		 }
	 }	
	 
	 public void select(int age){
		 Statement st=null;
		 try{
			 st=getDatabaseConnection().createStatement();
	   ResultSet rs =st.executeQuery("select * from rs_1992  where age="+ age+ "");
	   
	   while(rs.next())
	   {
	   System.out.println(rs.getInt("age") +"\t"+rs.getString("last")+"\t"+ rs.getString("first") + "\t"+rs.getString("address")+"\t"+ rs.getString("city")+ "\t"+rs.getString("state"));	
	   }
	 
		 }catch(Exception ex){
			 ex.printStackTrace();
			 
		 }
	 }
	   

}
