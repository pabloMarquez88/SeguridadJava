package com.globinch.client;

public class Prueba {
 public static void main (String args[]){
	 System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
	 System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
	 System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
	 System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
	
	 
	 Client cliente = new Client();
	 System.out.println(cliente.greet("PRUEBA QUE FUNCIONA"));
 }
}
