package com.qianfeng.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_ioc.xml");
        Leader leader = applicationContext.getBean(Leader.class);
        System.out.println(leader.getWater().getName());
    }
}
