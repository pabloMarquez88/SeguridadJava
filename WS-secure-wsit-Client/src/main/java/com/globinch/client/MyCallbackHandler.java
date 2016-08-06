/* @(#)MyWebServiceCallbackHandler.java
 * @author Binu George
 * Globinch.com
 * copyright http://www.globinch.com. All rights reserved.
 */
package com.globinch.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
/**
 * The callback handler class to manage username and password.
 * @author Binu George
 * @since 2013
 * @version 1.0
 */
public class MyCallbackHandler implements CallbackHandler {
   
	   public void handle(Callback[] callbacks) throws IOException,
	      UnsupportedCallbackException {
	         for (int i = 0; i < callbacks.length; i++) {
	            if (callbacks[i] instanceof NameCallback) {
	               NameCallback nc = (NameCallback) callbacks[i];
	               nc.setName("myuserid");
	            } else if (callbacks[i] instanceof PasswordCallback) {
	               PasswordCallback pc = (PasswordCallback) callbacks[i];
	               pc.setPassword("mypassword".toCharArray());
	            } else {
	               throw new UnsupportedCallbackException(callbacks[i],
	                  "Unrecognized Callback");
	            }
	         }
	   }
	}