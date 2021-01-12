package com.direccion.daos;

import java.sql.SQLException;
import java.sql.Statement;

import com.direccion.database.Conexion;
import com.direccion.modulos.PersonaVO;

public class PersonaDAO {
	public void registrarDatos(PersonaVO persona) {
		Conexion conn = new Conexion(); //creamos la conexion
		try {
			Statement stmt = conn.abrir().createStatement();
			String sql = "INSERT INTO personas (nombre,correo,mensaje) VALUES ('" + persona.getNombre() + "',"
			+ "'" + persona.getCorreo() + "'," + "'" + persona.getMensaje() + "')";
			stmt.execute(sql); //ejecutamos el string sql
			System.out.println("se registro correctamente");
			stmt.close();
		}catch(SQLException e) {
			System.out.println("No podemos registrar " + e.getMessage());
		}finally {
			System.out.println("Terminado el proceso");
			conn.cerrar();
		}
		
	}
}
