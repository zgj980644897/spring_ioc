package com.qianfeng;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringContenxt.class);
        Leader bean = applicationContext.getBean(Leader.class);
        System.out.println(bean.getWater().getName());
    }
}
