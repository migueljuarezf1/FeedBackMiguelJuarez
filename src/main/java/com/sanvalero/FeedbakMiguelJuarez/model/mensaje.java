package com.sanvalero.FeedbakMiguelJuarez.model;

import java.time.LocalDate;

public class mensaje {

	private LocalDate fecha;
	
	private String mensaje;
	private boolean recibido;
	
	private usuario usuarioEmisor;
	private usuario usuarioReceptor;
	
	public mensaje(LocalDate fecha, String mensaje, boolean recibido, usuario usuarioEmisor, usuario usuarioReceptor) {
		super();
		this.fecha = fecha;
		this.mensaje = mensaje;
		this.recibido = recibido;
		this.usuarioEmisor = usuarioEmisor;
		this.usuarioReceptor = usuarioReceptor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isRecibido() {
		return recibido;
	}

	public void setRecibido(boolean recibido) {
		this.recibido = recibido;
	}

	public usuario getUsuarioEmisor() {
		return usuarioEmisor;
	}

	public void setUsuarioEmisor(usuario usuarioEmisor) {
		this.usuarioEmisor = usuarioEmisor;
	}

	public usuario getUsuarioReceptor() {
		return usuarioReceptor;
	}

	public void setUsuarioReceptor(usuario usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}
	
	
	
}
