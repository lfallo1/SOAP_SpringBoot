
package com.lance.services.customerorders;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lance.services.customerorders package. 
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

    private final static QName _AllOrdersResponse_QNAME = new QName("http://customerorders.services.lance.com/", "allOrdersResponse");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://customerorders.services.lance.com/", "getOrdersResponse");
    private final static QName _AllOrdersRequest_QNAME = new QName("http://customerorders.services.lance.com/", "allOrdersRequest");
    private final static QName _DeleteOrdersResponse_QNAME = new QName("http://customerorders.services.lance.com/", "deleteOrdersResponse");
    private final static QName _GetOrdersRequest_QNAME = new QName("http://customerorders.services.lance.com/", "getOrdersRequest");
    private final static QName _CreateOrdersResponse_QNAME = new QName("http://customerorders.services.lance.com/", "createOrdersResponse");
    private final static QName _DeleteOrdersRequest_QNAME = new QName("http://customerorders.services.lance.com/", "deleteOrdersRequest");
    private final static QName _CreateOrdersRequest_QNAME = new QName("http://customerorders.services.lance.com/", "createOrdersRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lance.services.customerorders
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllOrdersRequest }
     * 
     */
    public AllOrdersRequest createAllOrdersRequest() {
        return new AllOrdersRequest();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link AllOrdersResponse }
     * 
     */
    public AllOrdersResponse createAllOrdersResponse() {
        return new AllOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateOrdersResponse }
     * 
     */
    public CreateOrdersResponse createCreateOrdersResponse() {
        return new CreateOrdersResponse();
    }

    /**
     * Create an instance of {@link GetOrdersRequest }
     * 
     */
    public GetOrdersRequest createGetOrdersRequest() {
        return new GetOrdersRequest();
    }

    /**
     * Create an instance of {@link DeleteOrdersResponse }
     * 
     */
    public DeleteOrdersResponse createDeleteOrdersResponse() {
        return new DeleteOrdersResponse();
    }

    /**
     * Create an instance of {@link CreateOrdersRequest }
     * 
     */
    public CreateOrdersRequest createCreateOrdersRequest() {
        return new CreateOrdersRequest();
    }

    /**
     * Create an instance of {@link DeleteOrdersRequest }
     * 
     */
    public DeleteOrdersRequest createDeleteOrdersRequest() {
        return new DeleteOrdersRequest();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "allOrdersResponse")
    public JAXBElement<AllOrdersResponse> createAllOrdersResponse(AllOrdersResponse value) {
        return new JAXBElement<AllOrdersResponse>(_AllOrdersResponse_QNAME, AllOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "allOrdersRequest")
    public JAXBElement<AllOrdersRequest> createAllOrdersRequest(AllOrdersRequest value) {
        return new JAXBElement<AllOrdersRequest>(_AllOrdersRequest_QNAME, AllOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "deleteOrdersResponse")
    public JAXBElement<DeleteOrdersResponse> createDeleteOrdersResponse(DeleteOrdersResponse value) {
        return new JAXBElement<DeleteOrdersResponse>(_DeleteOrdersResponse_QNAME, DeleteOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "getOrdersRequest")
    public JAXBElement<GetOrdersRequest> createGetOrdersRequest(GetOrdersRequest value) {
        return new JAXBElement<GetOrdersRequest>(_GetOrdersRequest_QNAME, GetOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "createOrdersResponse")
    public JAXBElement<CreateOrdersResponse> createCreateOrdersResponse(CreateOrdersResponse value) {
        return new JAXBElement<CreateOrdersResponse>(_CreateOrdersResponse_QNAME, CreateOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "deleteOrdersRequest")
    public JAXBElement<DeleteOrdersRequest> createDeleteOrdersRequest(DeleteOrdersRequest value) {
        return new JAXBElement<DeleteOrdersRequest>(_DeleteOrdersRequest_QNAME, DeleteOrdersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://customerorders.services.lance.com/", name = "createOrdersRequest")
    public JAXBElement<CreateOrdersRequest> createCreateOrdersRequest(CreateOrdersRequest value) {
        return new JAXBElement<CreateOrdersRequest>(_CreateOrdersRequest_QNAME, CreateOrdersRequest.class, null, value);
    }

}
