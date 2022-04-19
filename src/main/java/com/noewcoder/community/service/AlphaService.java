package com.noewcoder.community.service;

import com.noewcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {
    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化");

    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }

    public String find(){
        return alphaDao.selcet();
    }
}
