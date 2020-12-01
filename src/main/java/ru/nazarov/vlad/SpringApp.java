package ru.nazarov.vlad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nazarov.vlad.config.MainConfiguration;

/**
 * @author Rakhmankulov Ed
 */
public class SpringApp {

    private static final String SYSTEM_NAME = "systemName";

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);


        System.out.println("B : context constructed");
        Object bean = context.getBean(SYSTEM_NAME);
        System.out.println("C : system name got");

        Object bean2 = context.getBean(SYSTEM_NAME);

        System.out.println();
    }
}