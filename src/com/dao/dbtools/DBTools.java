package com.dao.dbtools;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBTools {

	private static Properties properties = getProperties();

	public static Connection getConnection() {
		Connection connection = null;

		String endpoint = properties.getProperty("endpoint");
		String port = properties.getProperty("port");
		String database = properties.getProperty("database");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");

		try {
			connection = DriverManager.getConnection("jdbc:mysql://" + endpoint + ":" + port + "/" + database, user,
					password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Properties getProperties() {
		Properties prop = new Properties();

		InputStream inputStream = null;

		inputStream = DBTools.class.getResourceAsStream("config.properties");

		try {
			prop.load(inputStream);
			inputStream.close();
			return prop;
		} catch (IOException e) {
			System.out.println("Aiutati che dio t'aiuta");
			e.printStackTrace();
		}
		return null;

	}

}
