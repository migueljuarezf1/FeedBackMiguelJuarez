package com.sanvalero.FeedbakMiguelJuarez.model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class jugador extends usuario {
	
	private String nombrejugador;
	
	private LocalDate fechanacimiento2;
	private int edad;
	private int dorsal;
	private String equipo;
	private int goles;
	private int partidosjugados;
	private int tarjetasamarillas;
	private int tarjetasrojas;
	
	List<partido> partido;

	
	
	public jugador(String nombreusuario, String contrasena, String fechanacimiento, String dni, String email,
			String nombrejugador, LocalDate fechanacimiento2, int edad, int dorsal, String equipo, int goles,
			int partidosjugados, int tarjetasamarillas, int tarjetasrojas) {
		super(nombreusuario, contrasena, fechanacimiento, dni, email);
		this.nombrejugador = nombrejugador;
		this.fechanacimiento2 = fechanacimiento2;
		this.edad = edad;
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.goles = goles;
		this.partidosjugados = partidosjugados;
		this.tarjetasamarillas = tarjetasamarillas;
		this.tarjetasrojas = tarjetasrojas;
		
		partido = new ArrayList<>();
	}



	public String getNombrejugador() {
		return nombrejugador;
	}



	public void setNombrejugador(String nombrejugador) {
		this.nombrejugador = nombrejugador;
	}



	public LocalDate getFechanacimiento2() {
		return fechanacimiento2;
	}



	public void setFechanacimiento2(LocalDate fechanacimiento2) {
		this.fechanacimiento2 = fechanacimiento2;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getDorsal() {
		return dorsal;
	}



	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}



	public String getEquipo() {
		return equipo;
	}



	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}



	public int getGoles() {
		return goles;
	}



	public void setGoles(int goles) {
		this.goles = goles;
	}



	public int getPartidosjugados() {
		return partidosjugados;
	}



	public void setPartidosjugados(int partidosjugados) {
		this.partidosjugados = partidosjugados;
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
}
