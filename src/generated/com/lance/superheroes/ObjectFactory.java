
package com.lance.superheroes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lance.superheroes package. 
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

    private final static QName _GetSuperheroDetailsResponse_QNAME = new QName("http://superheroes.lance.com/", "getSuperheroDetailsResponse");
    private final static QName _AllSuperheroDetailsResponse_QNAME = new QName("http://superheroes.lance.com/", "allSuperheroDetailsResponse");
    private final static QName _GetSuperheroDetailsRequest_QNAME = new QName("http://superheroes.lance.com/", "getSuperheroDetailsRequest");
    private final static QName _AllSuperheroDetailsRequest_QNAME = new QName("http://superheroes.lance.com/", "allSuperheroDetailsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lance.superheroes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSuperheroDetailsResponse }
     * 
     */
    public GetSuperheroDetailsResponse createGetSuperheroDetailsResponse() {
        return new GetSuperheroDetailsResponse();
    }

    /**
     * Create an instance of {@link GetSuperheroDetailsRequest }
     * 
     */
    public GetSuperheroDetailsRequest createGetSuperheroDetailsRequest() {
        return new GetSuperheroDetailsRequest();
    }

    /**
     * Create an instance of {@link AllSuperheroDetailsRequest }
     * 
     */
    public AllSuperheroDetailsRequest createAllSuperheroDetailsRequest() {
        return new AllSuperheroDetailsRequest();
    }

    /**
     * Create an instance of {@link AllSuperheroDetailsResponse }
     * 
     */
    public AllSuperheroDetailsResponse createAllSuperheroDetailsResponse() {
        return new AllSuperheroDetailsResponse();
    }

    /**
     * Create an instance of {@link Superhero }
     * 
     */
    public Superhero createSuperhero() {
        return new Superhero();
    }

    /**
     * Create an instance of {@link Suit }
     * 
     */
    public Suit createSuit() {
        return new Suit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuperheroDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superheroes.lance.com/", name = "getSuperheroDetailsResponse")
    public JAXBElement<GetSuperheroDetailsResponse> createGetSuperheroDetailsResponse(GetSuperheroDetailsResponse value) {
        return new JAXBElement<GetSuperheroDetailsResponse>(_GetSuperheroDetailsResponse_QNAME, GetSuperheroDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllSuperheroDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superheroes.lance.com/", name = "allSuperheroDetailsResponse")
    public JAXBElement<AllSuperheroDetailsResponse> createAllSuperheroDetailsResponse(AllSuperheroDetailsResponse value) {
        return new JAXBElement<AllSuperheroDetailsResponse>(_AllSuperheroDetailsResponse_QNAME, AllSuperheroDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSuperheroDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superheroes.lance.com/", name = "getSuperheroDetailsRequest")
    public JAXBElement<GetSuperheroDetailsRequest> createGetSuperheroDetailsRequest(GetSuperheroDetailsRequest value) {
        return new JAXBElement<GetSuperheroDetailsRequest>(_GetSuperheroDetailsRequest_QNAME, GetSuperheroDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllSuperheroDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superheroes.lance.com/", name = "allSuperheroDetailsRequest")
    public JAXBElement<AllSuperheroDetailsRequest> createAllSuperheroDetailsRequest(AllSuperheroDetailsRequest value) {
        return new JAXBElement<AllSuperheroDetailsRequest>(_AllSuperheroDetailsRequest_QNAME, AllSuperheroDetailsRequest.class, null, value);
    }

}
