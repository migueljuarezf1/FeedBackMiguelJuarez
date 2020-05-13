package com.sanvalero.FeedbakMiguelJuarez.model;

public class federacion extends usuario {
	
	private String perfil;
	private String departamento;

	
	public federacion(String nombreusuario, String contrasena, String fechanacimiento, String dni, String email,
			String perfil, String departamento) {
		super(nombreusuario, contrasena, fechanacimiento, dni, email);
		this.perfil = perfil;
		this.departamento = departamento;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void anadirPartido(partido partido, calendario calendario) {
		//Añade el partido al calendario X
	}
	
}
