package com.atguigu.server.dao;

import com.atguigu.server.bean.People;

public interface WebService {
    String hello(String name);
    People getPeopleById(Integer id);
}
