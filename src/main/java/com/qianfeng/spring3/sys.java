package com.qianfeng.spring3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class sys {
    public static <T> T intice (Class<T> clazz){
        T leader=null;
        try {
            leader=clazz.newInstance();
            Method[] methods=clazz.getDeclaredMethods();
            for (Method method:methods){
            Need need=method.getAnnotation(Need.class);
            if (need!=null){
                Class clazztea=need.value();
                Object instance = clazztea.newInstance();
                method.invoke(leader,instance);
                return leader;
            }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return leader;
    }
}
