package com.sanvalero.FeedbakMiguelJuarez.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class calendario {

	private LocalDate fecha;
	private LocalDate horario;
	
	private List<partido> partido;

	public calendario(LocalDate fecha, LocalDate horario) {
		super();
		this.fecha = fecha;
		this.horario = horario;
		partido = new ArrayList<>();
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getHorario() {
		return horario;
	}

	public void setHorario(LocalDate horario) {
		this.horario = horario;
	}

	public List<partido> getPartido() {
		return partido;
	}

	public void setPartido(List<partido> partido) {
		this.partido = partido;
	}
	
	
	
}
