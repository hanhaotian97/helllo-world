package com.hht.myspringbootdemo.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * <br/>Author hanhaotian
 * <br/>Description :
 * <br/>CreateTime 2021/6/21
 * @author hanhaotian
 */
@Component
public class MyEventPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    /**
     * 发布事件
     */
    public void publishEvent(ApplicationEvent event) {
        applicationContext.publishEvent(event);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
