package com.testsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSql {
	public static void main(String[] args) {

		try {
			Connection connection = ConnectionClass.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet;
			;
			resultSet = statement.executeQuery("select * from address");
			ResultSetMetaData metaData = resultSet.getMetaData();
			while (resultSet.next()) {
				for (int i = 1; i <= metaData.getColumnCount(); i++) {
					int lastColumnNr = i;
					String lastColumnName = metaData.getColumnName(i);
					System.out.println(lastColumnName+"   "+ resultSet.getString(i));
				}
				System.out.println("****************************");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
