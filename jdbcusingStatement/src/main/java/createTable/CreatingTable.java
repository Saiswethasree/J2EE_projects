package createTable;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreatingTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithstatement","root","root");
		Statement st = con.createStatement();
		st.execute("CREATE TABLE TEACHERS (ROLLNO INTEGER(10) NOT NULL, NAME VARCHAR(10) NOT NULL, SUBJECT VARCHAR(10) NOT NULL)");
		con.close();
		System.out.println("table created");
	}

}
