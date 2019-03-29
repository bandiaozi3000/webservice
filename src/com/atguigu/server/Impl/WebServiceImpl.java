package com.atguigu.server.Impl;

import com.atguigu.server.bean.People;
import com.atguigu.server.dao.WebService;

import javax.jws.WebMethod;
import java.util.HashMap;
import java.util.Map;

@javax.jws.WebService
public class WebServiceImpl implements WebService {

    private static  Map<Integer, People> map = null;
    static{
        map = new HashMap<Integer, People>();
        map.put(1,new People("zhangsan","male"));
        map.put(2,new People("lisi","male"));
        map.put(3,new People("wangwu","female"));

    }
    @WebMethod
    @Override
    public String hello(String name) {
        return "hello"+name;
    }

    @WebMethod
    @Override
    public People getPeopleById(Integer id) {
        return map.get(id);
    }


}
