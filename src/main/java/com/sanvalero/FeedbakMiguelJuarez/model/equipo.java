package com.sanvalero.FeedbakMiguelJuarez.model;

import java.time.LocalDate;

public class equipo {

	private LocalDate fechacreacion;
	private String nombreequipo;
	private String Camiseta1;
	private String Camiseta2;
	private String[] Categorias;
	private String Patrocinadores;
	
	
	
	public equipo(LocalDate fechacreacion, String nombreequipo, String camiseta1, String camiseta2, String[] categorias,
			String patrocinadores) {
		super();
		this.fechacreacion = fechacreacion;
		this.nombreequipo = nombreequipo;
		Camiseta1 = camiseta1;
		Camiseta2 = camiseta2;
		Categorias = categorias;
		Patrocinadores = patrocinadores;
	}



	public LocalDate getFechacreacion() {
		return fechacreacion;
	}



	public void setFechacreacion(LocalDate fechacreacion) {
		this.fechacreacion = fechacreacion;
	}



	public String getNombreequipo() {
		return nombreequipo;
	}



	public void setNombreequipo(String nombreequipo) {
		this.nombreequipo = nombreequipo;
	}



	public String getCamiseta1() {
		return Camiseta1;
	}



	public void setCamiseta1(String camiseta1) {
		Camiseta1 = camiseta1;
	}



	public String getCamiseta2() {
		return Camiseta2;
	}



	public void setCamiseta2(String camiseta2) {
		Camiseta2 = camiseta2;
	}



	public String[] getCategorias() {
		return Categorias;
	}



	public void setCategorias(String[] categorias) {
		Categorias = categorias;
	}



	public String getPatrocinadores() {
		return Patrocinadores;
	}



	public void setPatrocinadores(String patrocinadores) {
		Patrocinadores = patrocinadores;
	}



}
