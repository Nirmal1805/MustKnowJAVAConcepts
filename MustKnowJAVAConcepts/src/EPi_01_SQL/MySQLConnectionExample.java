package EPi_01_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//this is like system.setproperty for saying which DB we are using.
		Class.forName("com.mysql.cj.jdbc.Driver");

		//syntax("DB://username/databasename");
		Connection connection = DriverManager.
				getConnection("jdbc:mysql://root@localhost/Selenium_users");

		//if we given username and password for the DB its code
		//Connection connection = DriverManager.getConnection(null, null, null);
		//example-("jdbc:mysql://localhost:3306/Selenium_users","root","root");
		//syntax("DB:localhost:portdetails/DB name","username","password");

		Statement statement = connection.createStatement();

		ResultSet result = statement.executeQuery("SELECT * FROM superheros_table");
		//inside bracket this will be above the table created in localhost/phpmyadmin

		while(result.next()) {
			System.out.println("Name : " +result.getString(1)+" Nickname : "+ result.getString(2));
		}
	}


}
