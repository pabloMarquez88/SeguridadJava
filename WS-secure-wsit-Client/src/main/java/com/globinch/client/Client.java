package com.globinch.client;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.globinch.service.MyWebService;
/**
 * The web service client service invoker class.
 * @author Binu George
 * @since 2013
 * @version 1.0
 */
public class Client {
	private static URL url = null;
	private static Service service = null;
	private static final String PATH = "D:\\mtomtest\\download\\";
	
	public Client() {
		try {
			url = new URL("http://localhost:8080/WS-secure-wsit/?wsdl");
			QName qname = new QName("http://service.globinch.com/",
					"MyWebServiceService");
			service = Service.create(url, qname);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
       /**
	 * Upload image
	 * @return String
	 */
	public String uploadImage() {
		try {
			MyWebService myService = service.getPort(MyWebService.class);
			File file = new File(PATH + "11841.jpg");
			BufferedImage imageToUpload = null;
			try {
				imageToUpload = ImageIO.read(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			double d = Math.random();
			byte[] imageInByte = null;
			try {
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write(imageToUpload, "jpg", baos);
				baos.flush();
				imageInByte = baos.toByteArray();
				baos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			// now upload the image
			myService.uploadImage(imageInByte, "ImageFromClient" + d + ".jpg");
			String imageToDownload = d+"";
						
			return imageToDownload;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}
	/**
	 * Download the uploaded image
	 * @param imageName
	 * @return String
	 */
	public String downloadImage(String imageName) {
		try {
			MyWebService myService = service.getPort(MyWebService.class);
			// lets now download the uploaded image
			byte[] downloadedImage = myService
					.retrieveImage("ImageFromClient" + imageName + ".jpg");
			File imageFromServer = new File(PATH + "ImageFromServer" + imageName
					+ ".jpg");
			try {
				FileOutputStream fileOuputStream = new FileOutputStream(
						imageFromServer);
				fileOuputStream.write(downloadedImage);
				fileOuputStream.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "success";
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}
	/**
	 * Greet the customer
	 * @param name
	 * @return String
	 */
	public String greet(String name) {
		try {
			MyWebService myService = service.getPort(MyWebService.class);
			String message = myService.greetCustomer(name);
			System.out.println(message);
			return message;

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return "empty string";
	}

	public static void main(String[] args) {

		try {
			new Client().greet("Some user");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}