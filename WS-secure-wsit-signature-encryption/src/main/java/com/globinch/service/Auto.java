package com.globinch.service;

import java.math.BigDecimal;

public class Auto {
	private String modelo;
	private BigDecimal kilometraje;
	private Boolean funciona;
	private Persona conductor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(BigDecimal kilometraje) {
		this.kilometraje = kilometraje;
	}

	public Boolean getFunciona() {
		return funciona;
	}

	public void setFunciona(Boolean funciona) {
		this.funciona = funciona;
	}

	public Persona getConductor() {
		return conductor;
	}

	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}

	@Override
	public String toString() {
		String salida = "LOS DATOS DEL AUTO SON : \n"
				+" Modelo: " + modelo + " \n" 
				+" Kilometraje: " + kilometraje + " \n"
				+" Funciona: " + funciona + " \n"
				+" Persona: " + conductor + " \n";
		return salida;
	}

	
	
}
