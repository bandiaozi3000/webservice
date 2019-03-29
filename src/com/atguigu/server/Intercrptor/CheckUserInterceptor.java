package com.atguigu.server.Intercrptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;


import javax.xml.namespace.QName;

public class CheckUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    public CheckUserInterceptor() {
        super(Phase.PRE_PROTOCOL);
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        Header header = soapMessage.getHeader(new QName("atguigu"));
        if(header!=null){
            Element atguiguEle = (Element) header.getObject();
            String name = atguiguEle.getElementsByTagName("name").item(0).getTextContent();
            String password = atguiguEle.getElementsByTagName("password").item(0).getTextContent();
            System.out.println(name+""+password);
            if("zhangsan".equals(name)&&"male".equals(password)){
                System.out.println("Server success......");
                return;
            }else{
                System.out.println("Server fail......");
                throw new Fault(new RuntimeException("请求需要一个正确的用户名和密码！"));
            }
        }
    }
}
