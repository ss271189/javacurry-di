package jcspringframework.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingsController implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello Mr Xyz  --- Spanish";
    }
}
