package me.bigth.springframework;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class IoCContainerTest {
    @Test
    void testAnnotationConfigApplicationContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();
    }

    @Test
    void testGenericGroovyApplicationContext() {
        ApplicationContext context = new GenericGroovyApplicationContext("app-config.groovy");
        MyService service = context.getBean(MyService.class);
        service.doSomething();
    }
}
