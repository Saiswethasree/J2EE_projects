package createtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreatingTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithpreparedstatement","root","root");
		PreparedStatement p = con.prepareStatement("CREATE TABLE FACULTY (NUMBER INTEGER(10) NOT NULL,NAME VARCHAR(10) NOT NULL,SUB VARCHAR(10));");
		p.execute();
		con.close();
		System.out.println("updated");
	}
}
