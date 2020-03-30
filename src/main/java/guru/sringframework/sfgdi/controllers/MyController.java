package guru.sringframework.sfgdi.controllers;

import guru.sringframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/29/20
 * Time: 10:30 PM
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
