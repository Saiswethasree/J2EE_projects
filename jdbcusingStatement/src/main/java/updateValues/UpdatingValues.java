package updateValues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithstatement","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("UPDATE TEACHERS SET NAME='MAJJIGA' WHERE ROLLNO=4;");
		con.close();
		System.out.println("updated");
	}

}
