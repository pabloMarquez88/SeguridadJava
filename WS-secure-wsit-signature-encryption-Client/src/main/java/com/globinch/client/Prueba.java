package com.globinch.client;

import java.math.BigDecimal;

import com.globinch.service.Auto;
import com.globinch.service.Persona;

public class Prueba {
 public static void main (String args[]){
	 System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
	 System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
	 System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
	 System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	
	 
	 Client cliente = new Client();
	 System.out.println("GREET");
	 System.out.println(cliente.greet("PRUEBA QUE FUNCIONA"));
//	 System.out.println("UPLOAD");
//	 System.out.println(cliente.uploadImage());
//	 System.out.println("DOWNLOAD");
//	 System.out.println(cliente.downloadImage("archivo01"));
	 System.out.println("LLAMAR AUTO");
	 Auto auto = new Auto();
	 auto.setFunciona(true);
	 auto.setKilometraje(new BigDecimal(123.4));
	 auto.setModelo("HONDA");
	 Persona persona = new Persona();
	 persona.setDNI(33465789);
	 persona.setNombre("JORGE");
	 auto.setConductor(persona);
	 System.out.println(cliente.llamarAuto(auto));
 }
}
