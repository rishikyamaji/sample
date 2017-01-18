package working.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class AccessData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

      Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM",
				"rishi123");
      System.out.println("connection successfully established");
      
   Statement  st = connection.createStatement();
   ResultSet rs =st.executeQuery("select * from rs_1992 where rownum < 5");
   while(rs.next())
   {
   System.out.println(rs.getInt("age") +"\t"+rs.getString("last")+"\t"+ rs.getString("first"));
		
   }
 

	}

}
