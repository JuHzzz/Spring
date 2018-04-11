package com.spring_03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
       if("student".equals(o)){
           System.out.println("init方法前bean处理器："+o+s);
       }
        return o;

    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if("student".equals(o)){
            System.out.println("init方法后bean处理器："+o+s);
        }
        return o;
    }
}
