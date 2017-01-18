
public class Connect {
	Class.forName("org.postgresql.Driver");
	Connection connection = null;
	connection = DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:mkyong","username","password");
	connection.close();

}
