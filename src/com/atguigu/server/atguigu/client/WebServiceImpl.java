
package com.atguigu.server.atguigu.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceImpl", targetNamespace = "http://Impl.server.atguigu.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://Impl.server.atguigu.com/", className = "com.atguigu.server.atguigu.client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://Impl.server.atguigu.com/", className = "com.atguigu.server.atguigu.client.HelloResponse")
    public String hello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.atguigu.server.atguigu.client.People
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPeopleById", targetNamespace = "http://Impl.server.atguigu.com/", className = "com.atguigu.server.atguigu.client.GetPeopleById")
    @ResponseWrapper(localName = "getPeopleByIdResponse", targetNamespace = "http://Impl.server.atguigu.com/", className = "com.atguigu.server.atguigu.client.GetPeopleByIdResponse")
    public People getPeopleById(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
