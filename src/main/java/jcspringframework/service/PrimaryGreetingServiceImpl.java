package jcspringframework.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello Mr Xyz --  Primary";
    }

}

