package br.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO {

	private Connection c;

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		String hostName = "localhost";
		String dbName = "testebd";
		String user = "sys";
		String senha = "12345";
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		c = DriverManager.getConnection(String.format("jdbc:jtds:sqlserver://%s:1433;database=%s;user=%s;password=%s;",
				hostName, dbName, user, senha));

		return c;
	}

}