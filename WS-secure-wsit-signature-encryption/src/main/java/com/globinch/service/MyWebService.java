/*
 * @(#)MyWebService.java
 * @author Binu George
 * Globinch.com
 * copyright http://www.globinch.com. All rights reserved.
 */
package com.globinch.service;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;

/**
 * The web service implementation class.
 * @author Binu George
 * @since 2013
 * @version 1.0
 */
@WebService()
public class MyWebService implements MyWebServiceIntf {
	 final static String PATH = "D:\\mtomtest\\upload\\";

    /* (non-Javadoc)
	 * @see com.globinch.service.MyWebServiceIntf#greetCustomer(java.lang.String)
	 */
    @Override
    public String greetCustomer(String parameter) {
    	
        return "Hello..." + parameter;
    }
 	/* (non-Javadoc)
	 * @see com.globinch.service.MyWebServiceIntf#retrieveImage(java.lang.String)
	 */
 	@Override
	public Image retrieveImage(String name) {
 		
		try {
			// Create a file object with file name and read the image
			File image = new File(PATH + name);
			return ImageIO.read(image);
		} catch (IOException e) {
			throw new WebServiceException("Download Failed");
		}
	}
	/* (non-Javadoc)
	 * @see com.globinch.service.MyWebServiceIntf#uploadImage(java.awt.Image, java.lang.String)
	 */
	@Override
	public String uploadImage(Image file, String name) {
		
		if (file != null) {
			try {
				File image = new File(PATH + name);
				ImageIO.write((BufferedImage) file, "jpg", image);
			} catch (IOException e) {
				throw new WebServiceException("Upload Failed");
			}
			return "Upload Successful";
		}
		throw new WebServiceException("No data to upload.");
	}
  }