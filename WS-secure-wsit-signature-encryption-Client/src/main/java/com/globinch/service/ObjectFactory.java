
package com.globinch.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.globinch.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GreetCustomer_QNAME = new QName("http://service.globinch.com/", "greetCustomer");
    private final static QName _LlamarAutoResponse_QNAME = new QName("http://service.globinch.com/", "llamarAutoResponse");
    private final static QName _LlamarAuto_QNAME = new QName("http://service.globinch.com/", "llamarAuto");
    private final static QName _GreetCustomerResponse_QNAME = new QName("http://service.globinch.com/", "greetCustomerResponse");
    private final static QName _RetrieveImageResponse_QNAME = new QName("http://service.globinch.com/", "retrieveImageResponse");
    private final static QName _RetrieveImage_QNAME = new QName("http://service.globinch.com/", "retrieveImage");
    private final static QName _UploadImageResponse_QNAME = new QName("http://service.globinch.com/", "uploadImageResponse");
    private final static QName _UploadImage_QNAME = new QName("http://service.globinch.com/", "uploadImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.globinch.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadImage }
     * 
     */
    public UploadImage createUploadImage() {
        return new UploadImage();
    }

    /**
     * Create an instance of {@link UploadImageResponse }
     * 
     */
    public UploadImageResponse createUploadImageResponse() {
        return new UploadImageResponse();
    }

    /**
     * Create an instance of {@link RetrieveImage }
     * 
     */
    public RetrieveImage createRetrieveImage() {
        return new RetrieveImage();
    }

    /**
     * Create an instance of {@link RetrieveImageResponse }
     * 
     */
    public RetrieveImageResponse createRetrieveImageResponse() {
        return new RetrieveImageResponse();
    }

    /**
     * Create an instance of {@link GreetCustomerResponse }
     * 
     */
    public GreetCustomerResponse createGreetCustomerResponse() {
        return new GreetCustomerResponse();
    }

    /**
     * Create an instance of {@link LlamarAuto }
     * 
     */
    public LlamarAuto createLlamarAuto() {
        return new LlamarAuto();
    }

    /**
     * Create an instance of {@link LlamarAutoResponse }
     * 
     */
    public LlamarAutoResponse createLlamarAutoResponse() {
        return new LlamarAutoResponse();
    }

    /**
     * Create an instance of {@link GreetCustomer }
     * 
     */
    public GreetCustomer createGreetCustomer() {
        return new GreetCustomer();
    }

    /**
     * Create an instance of {@link Auto }
     * 
     */
    public Auto createAuto() {
        return new Auto();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "greetCustomer")
    public JAXBElement<GreetCustomer> createGreetCustomer(GreetCustomer value) {
        return new JAXBElement<GreetCustomer>(_GreetCustomer_QNAME, GreetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LlamarAutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "llamarAutoResponse")
    public JAXBElement<LlamarAutoResponse> createLlamarAutoResponse(LlamarAutoResponse value) {
        return new JAXBElement<LlamarAutoResponse>(_LlamarAutoResponse_QNAME, LlamarAutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LlamarAuto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "llamarAuto")
    public JAXBElement<LlamarAuto> createLlamarAuto(LlamarAuto value) {
        return new JAXBElement<LlamarAuto>(_LlamarAuto_QNAME, LlamarAuto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "greetCustomerResponse")
    public JAXBElement<GreetCustomerResponse> createGreetCustomerResponse(GreetCustomerResponse value) {
        return new JAXBElement<GreetCustomerResponse>(_GreetCustomerResponse_QNAME, GreetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "retrieveImageResponse")
    public JAXBElement<RetrieveImageResponse> createRetrieveImageResponse(RetrieveImageResponse value) {
        return new JAXBElement<RetrieveImageResponse>(_RetrieveImageResponse_QNAME, RetrieveImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "retrieveImage")
    public JAXBElement<RetrieveImage> createRetrieveImage(RetrieveImage value) {
        return new JAXBElement<RetrieveImage>(_RetrieveImage_QNAME, RetrieveImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "uploadImageResponse")
    public JAXBElement<UploadImageResponse> createUploadImageResponse(UploadImageResponse value) {
        return new JAXBElement<UploadImageResponse>(_UploadImageResponse_QNAME, UploadImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.globinch.com/", name = "uploadImage")
    public JAXBElement<UploadImage> createUploadImage(UploadImage value) {
        return new JAXBElement<UploadImage>(_UploadImage_QNAME, UploadImage.class, null, value);
    }

}
