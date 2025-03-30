package me.bigth.springframework;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    static MyService myService() {
        return new MyService();
    }
}
