/*
 * @(#) MyServicePasswordValidator.java
 * @author Binu George
 * Globinch.com
 * copyright http://www.globinch.com. All rights reserved.
 */
package com.globinch.service;

import com.sun.xml.wss.impl.callback.PasswordValidationCallback;
/**
 * The plain text password validation class.
 * @author Binu George
 * @since 2013
 * @version 1.0
 */
public class MyServicePasswordValidator implements
        PasswordValidationCallback.PasswordValidator {
	
    public boolean validate(PasswordValidationCallback.Request request)
            throws PasswordValidationCallback.PasswordValidationException {

        PasswordValidationCallback.PlainTextPasswordRequest plainTextRequest 
            = (PasswordValidationCallback.PlainTextPasswordRequest) request;
          if ("myuserid".equals(plainTextRequest.getUsername())
                && "mypassword".equals(plainTextRequest.getPassword())) {
            return true;
        
        }else{
        	throw new PasswordValidationCallback.PasswordValidationException("Invalid credentials provided. Authentication failed");
        }
        
        //return false;
    }
}