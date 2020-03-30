package guru.sringframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/29/20
 * Time: 11:22 PM
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
