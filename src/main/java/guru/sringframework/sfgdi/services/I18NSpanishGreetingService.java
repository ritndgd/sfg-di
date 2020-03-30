package guru.sringframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created By: Ritwij Nadagouda
 * Date: 3/29/20
 * Time: 11:40 PM
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
