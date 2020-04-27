
package com.ws.conversion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.conversion package. 
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

    private final static QName _ToDZD_QNAME = new QName("http://conversion.ws.com/", "ToDZD");
    private final static QName _ToDZDResponse_QNAME = new QName("http://conversion.ws.com/", "ToDZDResponse");
    private final static QName _FromDZDResponse_QNAME = new QName("http://conversion.ws.com/", "FromDZDResponse");
    private final static QName _FromDZD_QNAME = new QName("http://conversion.ws.com/", "FromDZD");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.conversion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ToDZD }
     * 
     */
    public ToDZD createToDZD() {
        return new ToDZD();
    }

    /**
     * Create an instance of {@link ToDZDResponse }
     * 
     */
    public ToDZDResponse createToDZDResponse() {
        return new ToDZDResponse();
    }

    /**
     * Create an instance of {@link FromDZDResponse }
     * 
     */
    public FromDZDResponse createFromDZDResponse() {
        return new FromDZDResponse();
    }

    /**
     * Create an instance of {@link FromDZD }
     * 
     */
    public FromDZD createFromDZD() {
        return new FromDZD();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToDZD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversion.ws.com/", name = "ToDZD")
    public JAXBElement<ToDZD> createToDZD(ToDZD value) {
        return new JAXBElement<ToDZD>(_ToDZD_QNAME, ToDZD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToDZDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversion.ws.com/", name = "ToDZDResponse")
    public JAXBElement<ToDZDResponse> createToDZDResponse(ToDZDResponse value) {
        return new JAXBElement<ToDZDResponse>(_ToDZDResponse_QNAME, ToDZDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FromDZDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversion.ws.com/", name = "FromDZDResponse")
    public JAXBElement<FromDZDResponse> createFromDZDResponse(FromDZDResponse value) {
        return new JAXBElement<FromDZDResponse>(_FromDZDResponse_QNAME, FromDZDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FromDZD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://conversion.ws.com/", name = "FromDZD")
    public JAXBElement<FromDZD> createFromDZD(FromDZD value) {
        return new JAXBElement<FromDZD>(_FromDZD_QNAME, FromDZD.class, null, value);
    }

}
