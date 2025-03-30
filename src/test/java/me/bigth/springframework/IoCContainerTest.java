package me.bigth.springframework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCContainerTest {
    @Test
    void testAnnotationConfigApplicationContext() {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();
    }
}
