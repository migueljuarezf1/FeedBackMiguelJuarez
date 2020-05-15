package com.sanvalero.FeedbakMiguelJuarez.model;

public class Detalle_Equipo {

	private int partidosjugados;
	private int partidosganados;
	private int partidosperdidos;
	private int partidosempatados;
	private int golsafavor;
	private int golesencontra;
	private int puntos;
	
	
	public Detalle_Equipo(int partidosjugados, int partidosganados, int partidosperdidos, int partidosempatados,
			int golsafavor, int golesencontra, int puntos) {
		super();
		this.partidosjugados = partidosjugados;
		this.partidosganados = partidosganados;
		this.partidosperdidos = partidosperdidos;
		this.partidosempatados = partidosempatados;
		this.golsafavor = golsafavor;
		this.golesencontra = golesencontra;
		this.puntos = puntos;
	}


	public int getPartidosjugados() {
		return partidosjugados;
	}


	public void setPartidosjugados(int partidosjugados) {
		this.partidosjugados = partidosjugados;
	}


	public int getPartidosganados() {
		return partidosganados;
	}


	public void setPartidosganados(int partidosganados) {
		this.partidosganados = partidosganados;
	}


	public int getPartidosperdidos() {
		return partidosperdidos;
	}


	public void setPartidosperdidos(int partidosperdidos) {
		this.partidosperdidos = partidosperdidos;
	}


	public int getPartidosempatados() {
		return partidosempatados;
	}


	public void setPartidosempatados(int partidosempatados) {
		this.partidosempatados = partidosempatados;
	}


	public int getGolsafavor() {
		return golsafavor;
	}


	public void setGolsafavor(int golsafavor) {
		this.golsafavor = golsafavor;
	}


	public int getGolesencontra() {
		return golesencontra;
	}


	public void setGolesencontra(int golesencontra) {
		this.golesencontra = golesencontra;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
}
