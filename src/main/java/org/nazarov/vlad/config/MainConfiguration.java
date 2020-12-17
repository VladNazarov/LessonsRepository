package org.nazarov.vlad.config;

import org.nazarov.vlad.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.nazarov.vlad")
public class MainConfiguration {

    @Bean
    public Message message() {
        return new Message("Header", "Body", "Vlad");
    }
}
