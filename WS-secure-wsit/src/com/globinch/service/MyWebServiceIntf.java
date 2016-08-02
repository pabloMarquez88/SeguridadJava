/*
 * @(#)MyWebServiceIntf.java
 * @author Binu George
 * Globinch.com
 * copyright http://www.globinch.com. All rights reserved.
 */
package com.globinch.service;

import java.awt.Image;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
/**
 * The SEI
 * @author Binu George
 * @since 2013
 * @version 1.0
 */
@WebService(name="MyWebService")
public interface MyWebServiceIntf {
//	 wsgen -verbose -wsdl:Xsoap1.2 -extension wsdl -cp src -d C:\Users\map53733\Desktop\metro-standalone-2.3.1\metro\bin\hola -s C:\Users\map53733\Desktop\metro-standalone-2.3.1\metro\bin\hola2 com.globinch.service.MyWebService

	/**
	 * Web service operation
	 */
	@WebMethod(operationName = "greetCustomer")
	public String greetCustomer(@WebParam(name = "parameter") String parameter);

	@WebMethod(operationName = "retrieveImage")
	public Image retrieveImage(@WebParam(name = "name") String name);

	@WebMethod(operationName = "uploadImage")
	public String uploadImage(@WebParam(name = "file") Image file,
			@WebParam(name = "name") String name);

}