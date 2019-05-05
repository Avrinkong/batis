
package com.it.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring容器上下文工具类，用于获取当前的Spring容器
 * 实现了接口ApplicationContextAware且该类被Spring管理
 *则会自动调用setApplicationContext方法获取Spring容器对象
 */
@Component
public class ContextUtils implements ApplicationContextAware {
    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static Object getBean(String beanName){
        return context.getBean(beanName);
    }

    public static <T> T getBean(Class<T> clazz){
        return  context.getBean(clazz);
    }

    public static <T> T getBean(String beanName,Class<T> clazz){
        return  context.getBean(beanName,clazz);
    }
}