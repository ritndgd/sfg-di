package guru.sringframework.sfgdi.controllers;

import guru.sringframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/29/20
 * Time: 11:37 PM
 */

@Controller
public class I18NController {

    private final GreetingService greetingService;

    public I18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String seyHello() {
        return greetingService.sayGreeting();
    }
}
