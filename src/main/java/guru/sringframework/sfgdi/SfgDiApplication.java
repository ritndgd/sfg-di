package guru.sringframework.sfgdi;

import guru.sringframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SfgDiApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");
        System.out.println("------ Primary Bean ------");
        System.out.println(myController.sayHello());

        System.out.println("------ Property Injected Controller ------");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("------ Setter Injected Controller ------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------ Constructor Injected Controller ------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        I18NController i18NController = (I18NController) applicationContext.getBean("i18NController");
        System.out.println(i18NController.seyHello());
    }

}
