package com.direccion.modulos;

public class PersonaVO {
	private String nombre;
	private String correo;
	private String mensaje;
	
	public PersonaVO(String nombre, String correo, String mensaje) {
		this.nombre = nombre;
		this.correo = correo;
		this.mensaje = mensaje;
	}
	public PersonaVO() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	@Override
	public String toString() {
		return "PersonaVO [nombre=" + nombre + ", correo=" + correo + ", mensaje=" + mensaje + "]";
	}
	
	
	
}
