package com.atguigu.server.Intercrptor;


import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

public class AddUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String name;
    private String password;

    public AddUserInterceptor(String name, String password) {
        super(Phase.PRE_PROTOCOL);
        this.name = name;
        this.password = password;
    }

    /**
     * 给传递的Message消息体添加头
     * <Envelope>
     * <head>
     * <name>
     * name
     * </name>
     * <password>
     * password
     * </password>
     * </head>
     * <body>
     * <hello>
     * <arg0></arg0>
     * </hello>
     * </body>
     * </Envelope>
     *
     * @param soapMessage
     * @throws Fault
     */
    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        Document document =  DOMUtils.createDocument();
        Element rootEle = document.createElement("atguigu");
        Element nameEle = document.createElement("name");
        nameEle.setTextContent(name);
        rootEle.appendChild(nameEle);
        Element passwordEle = document.createElement("password");
        passwordEle.setTextContent(password);
        rootEle.appendChild(passwordEle);
        headers.add(new Header(new QName("atguigu"), rootEle));
        System.out.println("client handleMessage......");
    }
}
