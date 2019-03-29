package com.atguigu.server.atguigu.client;

import com.atguigu.server.Intercrptor.AddUserInterceptor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.message.Message;

import java.util.List;

public class WebServiceClient {
    public static void main(String[] args) {
        WebServiceImplService factory = new WebServiceImplService();
        WebServiceImpl webServiceImpl = factory.getWebServiceImplPort();
        Client client = ClientProxy.getClient(webServiceImpl);

        List<Interceptor<? extends Message>> outinterceptorList = client.getOutInterceptors();
        outinterceptorList.add(new AddUserInterceptor("zhangsan", "male"));
        System.out.println(webServiceImpl.hello("zhangsan"));

    }
}
