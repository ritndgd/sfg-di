package guru.sringframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/29/20
 * Time: 11:27 PM
 */

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
