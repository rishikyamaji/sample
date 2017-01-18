package working.database;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DataHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Statement stmt;
		ResultSet rset;
		String query;
		String sqlString;
		getDBConnection();
		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		query = "SELECT * FROM Employees ORDER BY employee_id";
		System.out.println("\nExecuting query: " + query);
		rset = stmt.executeQuery(query); 
		return rset;
		
		public ResultSet getAllEmployees() throws SQLException{ 
			
		}
		}

	}

}
