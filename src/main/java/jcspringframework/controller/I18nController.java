package jcspringframework.controller;

import jcspringframework.service.GreetingService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
public class I18nController implements InitializingBean, DisposableBean , BeanPostProcessor , BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Just for testing initializing bean hook up call");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Calling destroy hook up methods ");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("PostConstruct hookup");
    }

    @PreDestroy
    public void preDestory(){
        System.out.println("Pre Destroy");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("---------------------------------------------- BeanFactoryAware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("---------------------------------------------- BeanNameAware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("---------------------------------------------- Application context aware");
    }
}
