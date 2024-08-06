package updatevalues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithpreparedstatement","root","root");
		PreparedStatement p = con.prepareStatement("UPDATE FACULTY SET NUMBER=4 WHERE NAME='MAJJIGA';");
		p.executeUpdate();
		con.close();
		System.out.println("updated");
	}

}
