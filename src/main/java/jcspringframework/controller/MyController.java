package jcspringframework.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    public String sayHello(){
        System.out.println("Hey There");
        return "Hey There!! Welcome";
    }
}
