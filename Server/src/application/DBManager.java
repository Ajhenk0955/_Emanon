package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * THIS CLASS USES PREPARED STATEMENTS IN EACH METHOD :D
 */
public class DBManager {
	private Connection con;

	String removePatient = "";
	String updatePatient = "";
	String search = "";
	String addFile = "";
	String removeFile = "";
	String updateFile = "";

	DBManager() {
		DBClass objDbClass = new DBClass();
		try {
			con = objDbClass.getConnection();
		} catch (ClassNotFoundException ce) {
			// logger.info(ce.toString());
		} catch (SQLException ce) {
			// logger.info(ce.toString());
		}
	}

	// TEMPLATE METHOD, need a lot of these //TODO
	public ResultSet addPatient() {
		String sql = "select * from people where firstname=? and lastname=?";
		ResultSet result = null;
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setString(1, "John");
			preparedStatement.setString(2, "Smith");

			result = preparedStatement.executeQuery();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;

	}

	public void addFile() {
		// TODO Auto-generated method stub
		
	}

	public void search() {
		// TODO Auto-generated method stub
		
	}

	public void removePatient() {
		// TODO Auto-generated method stub
		
	}

	public void removeFile() {
		// TODO Auto-generated method stub
		
	}
}
