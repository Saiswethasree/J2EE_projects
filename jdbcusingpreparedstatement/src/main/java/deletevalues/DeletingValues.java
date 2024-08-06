package deletevalues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithpreparedstatement","root","root");
		PreparedStatement p = con.prepareStatement("DELETE FROM FACULTY WHERE NUMBER=3;");
		p.executeUpdate();
		con.close();
		System.out.println("updated");
	}

}
