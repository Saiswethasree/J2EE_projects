package createdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreatingDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		PreparedStatement p = con.prepareStatement("CREATE DATABASE JDBCWITHPREPAREDSTATEMENT");
		p.execute();
		con.close();
		System.out.println("created");
	}

}
