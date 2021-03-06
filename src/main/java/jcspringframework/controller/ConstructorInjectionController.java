package jcspringframework.controller;

import jcspringframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private final GreetingService greetingService;


    public ConstructorInjectionController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        System.out.println("Constructor Invoked");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }


}
