package me.bigth.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class IoCContainer {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService service = context.getBean(MyService.class);
        service.doSomething();
    }

    static class AppConfig {
        @Bean
        static MyService myService() {
            return new MyService();
        }
    }

    static class MyService {
        public void doSomething() {
            System.out.println("Do something");
        }
    }
}
