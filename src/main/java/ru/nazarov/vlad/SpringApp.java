package ru.nazarov.vlad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nazarov.vlad.broadcast.BroadcastService;
import ru.nazarov.vlad.config.MainConfiguration;

/**
 * @author Rakhmankulov Ed
 */
public class SpringApp {

    private static final String SYSTEM_NAME = "systemName";

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);

        BroadcastService bean = context.getBean(BroadcastService.class);
        System.out.println();
    }
}