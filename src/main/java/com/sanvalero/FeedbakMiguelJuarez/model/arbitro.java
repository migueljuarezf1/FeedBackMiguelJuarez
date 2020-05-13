package com.sanvalero.FeedbakMiguelJuarez.model;

public class arbitro extends usuario {

	private String nombreusuario;
	private int numerocolegiado;
	
	
	public arbitro(String nombreusuario, String contrasena, String fechanacimiento, String dni, String email,
			String nombreusuario2, int numerocolegiado) {
		super(nombreusuario, contrasena, fechanacimiento, dni, email);
		nombreusuario = nombreusuario2;
		this.numerocolegiado = numerocolegiado;
	}


	public String getNombreusuario() {
		return nombreusuario;
	}


	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}


	public int getNumerocolegiado() {
		return numerocolegiado;
	}


	public void setNumerocolegiado(int numerocolegiado) {
		this.numerocolegiado = numerocolegiado;
	}
	
	
}
