package insertValuesToTables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithstatement","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("INSERT INTO TEACHERS VALUES(5,'SRE','ENGLISH');");
		con.close();
		System.out.println("inserted values");
	}

}
