package org.nazarov.vlad;

import org.nazarov.vlad.config.DeliveryConfiguration;
import org.nazarov.vlad.delivery.model.Courier;
import org.nazarov.vlad.delivery.service.CourierRepository;
import org.nazarov.vlad.delivery.service.DeliveryServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

/**
 *
 * @author Rakhmankulov Ed
 */
public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DeliveryConfiguration.class);
        CourierRepository courierRepository = applicationContext.getBean(CourierRepository.class);

        String id = UUID.randomUUID().toString();
        courierRepository.addEntity(new Courier(id, "Ivan"));

        System.out.println(courierRepository.getEntityById(id));
    }

}
