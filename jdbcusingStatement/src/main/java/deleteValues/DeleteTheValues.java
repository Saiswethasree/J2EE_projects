package deleteValues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTheValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithstatement","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("DELETE  FROM TEACHERS WHERE ROLLNO=5;");
		con.close();
		System.out.println("DELETED");
	}

}
