package guru.sringframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/29/20
 * Time: 10:50 PM
 */

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
