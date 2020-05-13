package com.sanvalero.FeedbakMiguelJuarez.model;

import java.time.LocalDate;

public class Detalle_Partido {

	private int tarjetasamarillas;
	private int tarjetasrojas;
	private int resultado;
	private int cambios;
	private LocalDate feha;
	private partido partido;
	
	
	//Vamos a realizar el total de goles que tendriamos en X partido
	
	public static int add(int equipo1, int equipo2) {
		return equipo1 + equipo2;
		
	}
	
	
	public Detalle_Partido(int tarjetasamarillas, int tarjetasrojas, int resultado, int cambios, LocalDate feha,
			com.sanvalero.FeedbakMiguelJuarez.model.partido partido) {
		super();
		this.tarjetasamarillas = tarjetasamarillas;
		this.tarjetasrojas = tarjetasrojas;
		this.resultado = resultado;
		this.cambios = cambios;
		this.feha = feha;
		this.partido = partido;
	}

	public int getTarjetasamarillas() {
		return tarjetasamarillas;
	}

	public void setTarjetasamarillas(int tarjetasamarillas) {
		this.tarjetasamarillas = tarjetasamarillas;
	}

	public int getTarjetasrojas() {
		return tarjetasrojas;
	}

	public void setTarjetasrojas(int tarjetasrojas) {
		this.tarjetasrojas = tarjetasrojas;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	public LocalDate getFeha() {
		return feha;
	}

	public void setFeha(LocalDate feha) {
		this.feha = feha;
	}

	public partido getPartido() {
		return partido;
	}

	public void setPartido(partido partido) {
		this.partido = partido;
	}
	
	
	
	
}
