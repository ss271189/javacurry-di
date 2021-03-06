package jcspringframework.controller;

import jcspringframework.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    @Autowired
    @Qualifier("setterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("Setter Called");
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
