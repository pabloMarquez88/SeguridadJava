package com.globinch.service;

public class Persona {
	private String nombre;
	private Integer DNI;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDNI() {
		return DNI;
	}

	public void setDNI(Integer dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "NOMBRE: " + nombre + " DNI: " + DNI;
	}

}
