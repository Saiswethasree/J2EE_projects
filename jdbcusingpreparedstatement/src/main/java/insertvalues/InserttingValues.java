package insertvalues;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserttingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcwithpreparedstatement","root","root");
		PreparedStatement p = con.prepareStatement("INSERT INTO FACULTY VALUES(3,'SREE','URDU');");
		p.execute();
		con.close();
		System.out.println("INSERTED");
	}

}
