package com.atguigu.server;

import com.atguigu.server.Impl.WebServiceImpl;
import com.atguigu.server.Intercrptor.CheckUserInterceptor;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;

import javax.xml.ws.Endpoint;
import java.util.List;

public class WebServiceServer {
    public static void main(String[] args) {
        String address = "http://localhost:8080/hello";
        Endpoint endpoint = Endpoint.publish(address,new WebServiceImpl());
        EndpointImpl endpoint1 = (EndpointImpl)endpoint;
        List<Interceptor<? extends Message>> interceptorList = ((EndpointImpl) endpoint).getInInterceptors();
        interceptorList.add(new CheckUserInterceptor());
//        List<Interceptor<? extends Message>> outinterceptorList = ((EndpointImpl) endpoint).getOutInterceptors();
//        interceptorList.add(new LoggingOutInterceptor());
    }
}
