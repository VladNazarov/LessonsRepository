package org.nazarov.vlad.config;

import org.nazarov.vlad.Message;
import org.nazarov.vlad.delivery.model.Consumer;
import org.nazarov.vlad.delivery.model.Courier;
import org.nazarov.vlad.delivery.service.DeliveryRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("org.nazarov.vlad")
public class MainConfiguration {

    @Bean
    public Message message() {
        return new Message("Header", "Body", "Vlad");
    }

    @Bean
    public Map<String, Courier> courierMap() {
        return new HashMap<>();
    }

    @Bean
    public DeliveryRepository<Courier> courierRepository() {
        return new DeliveryRepository<>(courierMap());
    }

    @Bean
    public Map<String, Consumer> consumerMap() {
        return new HashMap<>();
    }

    @Bean
    public DeliveryRepository<Consumer> consumerRepository() {
        return new DeliveryRepository<>(consumerMap());
    }

}
