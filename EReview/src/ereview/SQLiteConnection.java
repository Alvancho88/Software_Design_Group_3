package ereview;

import java.sql.*;
import javax.swing.*;


public class SQLiteConnection {
	Connection conn=null;
	public static Connection dbConnector(){
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\ALDI\\Programs\\Eclipse_2\\Databases_2\\Editor.sqlite");
			JOptionPane.showMessageDialog(null, "Connection Successful");
			return conn;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}

}
