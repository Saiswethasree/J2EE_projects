package creatingtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		Statement s = con.createStatement();
		s.execute("CREATE TABLE EMPLOYEE (ID INTEGER(10) NOT NULL, NAME VARCHAR(10) NOT NULL, COMPANY VARCHAR(10) NOT NULL)");
		con.close();
		System.out.println("table created");
	}

}
