
package com.atguigu.server.atguigu.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.atguigu.server.atguigu.client package. 
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

    private final static QName _Hello_QNAME = new QName("http://Impl.server.atguigu.com/", "hello");
    private final static QName _GetPeopleById_QNAME = new QName("http://Impl.server.atguigu.com/", "getPeopleById");
    private final static QName _GetPeopleByIdResponse_QNAME = new QName("http://Impl.server.atguigu.com/", "getPeopleByIdResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://Impl.server.atguigu.com/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.atguigu.server.atguigu.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetPeopleById }
     * 
     */
    public GetPeopleById createGetPeopleById() {
        return new GetPeopleById();
    }

    /**
     * Create an instance of {@link GetPeopleByIdResponse }
     * 
     */
    public GetPeopleByIdResponse createGetPeopleByIdResponse() {
        return new GetPeopleByIdResponse();
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Impl.server.atguigu.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Impl.server.atguigu.com/", name = "getPeopleById")
    public JAXBElement<GetPeopleById> createGetPeopleById(GetPeopleById value) {
        return new JAXBElement<GetPeopleById>(_GetPeopleById_QNAME, GetPeopleById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Impl.server.atguigu.com/", name = "getPeopleByIdResponse")
    public JAXBElement<GetPeopleByIdResponse> createGetPeopleByIdResponse(GetPeopleByIdResponse value) {
        return new JAXBElement<GetPeopleByIdResponse>(_GetPeopleByIdResponse_QNAME, GetPeopleByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Impl.server.atguigu.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
