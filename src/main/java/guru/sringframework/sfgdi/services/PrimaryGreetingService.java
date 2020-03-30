package guru.sringframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/29/20
 * Time: 11:31 PM
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
