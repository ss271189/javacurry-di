package jcspringframework.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements  GreetingService{

    @Override
    public String sayHello() {
        return "Hello Mr Xyz --  Property";
    }
}
