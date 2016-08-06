package com.globinch.client;

public class Prueba {
 public static void main (String args[]){
	 System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
	 System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
	 System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
	 System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	
	 
	 Client cliente = new Client();
	 System.out.println("GREET");
	 System.out.println(cliente.greet("PRUEBA QUE FUNCIONA"));
	 System.out.println("UPLOAD");
	 System.out.println(cliente.uploadImage());
	 System.out.println("DOWNLOAD");
	 System.out.println(cliente.downloadImage("archivo01"));
 }
}
