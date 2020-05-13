package com.sanvalero.FeedbakMiguelJuarez.model;

import java.util.ArrayList;
import java.util.List;

public class usuario {
	private String nombreusuario;
	private String contrasena;
	private String fechanacimiento;
	private String dni;
	private String email;	
	
	private List<mensaje> mensajeenviado;
	private List<mensaje> mensajerecibido;

	
	public usuario(String nombreusuario, String contrasena, String fechanacimiento, String dni, String email) {
		super();
		this.nombreusuario = nombreusuario;
		this.contrasena = contrasena;
		this.fechanacimiento = fechanacimiento;
		this.dni = dni;
		this.email = email;
		
		mensajeenviado = new ArrayList<>();
		mensajerecibido = new ArrayList<>();
		
	}
	
	
	
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
