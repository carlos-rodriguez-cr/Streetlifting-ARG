package com.direccion.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String bd = "streetlifting";
	static String login = "root";
	static String pass = "";
	static String url ="jdbc:mysql://localhost/" + bd;
	Connection conn = null;
	
	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,login,pass);
			if(conn != null) {
				System.out.println("Conectado!");
			}
		}catch(SQLException e) {
			System.out.println("Error al conectar con la base de datos"+ e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println("Error de clase "+ e.getMessage());
		}catch(Exception e) {
			System.out.println("Error generico" +e.getMessage());
		}
	}
	
	public Connection abrir() {
		return conn;
	}
	
	public void cerrar() {
		conn = null;
	}
}