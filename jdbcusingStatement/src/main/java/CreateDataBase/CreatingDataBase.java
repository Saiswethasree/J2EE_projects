package CreateDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement st = con.createStatement();
		st.execute("CREATE DATABASE JDBCWITHSTATEMENT");
		con.close();
		System.out.println("data base created");
	}

}
