package com.sanvalero.FeedbakMiguelJuarez.model;

import java.util.List;
import java.util.ArrayList;

public class partido {

	private int jornada;

	private String equipolocal;
	private String equipovisitante;
	private String campo;
	private String arbitro;
	
	private List<Detalle_Partido> detalles;
	
		public partido(int jornada, String equipolocal, String equipovisitante, String campo, String arbitro) {
		super();
		this.jornada = jornada;
		this.equipolocal = equipolocal;
		this.equipovisitante = equipovisitante;
		this.campo = campo;
		this.arbitro = arbitro;
		
		detalles = new ArrayList<>();
	}

		public int getJornada() {
			return jornada;
		}

		public void setJornada(int jornada) {
			this.jornada = jornada;
		}

		public String getEquipolocal() {
			return equipolocal;
		}

		public void setEquipolocal(String equipolocal) {
			this.equipolocal = equipolocal;
		}

		public String getEquipovisitante() {
			return equipovisitante;
		}

		public void setEquipovisitante(String equipovisitante) {
			this.equipovisitante = equipovisitante;
		}

		public String getCampo() {
			return campo;
		}

		public void setCampo(String campo) {
			this.campo = campo;
		}

		public String getArbitro() {
			return arbitro;
		}

		public void setArbitro(String arbitro) {
			this.arbitro = arbitro;
		}
		
}
