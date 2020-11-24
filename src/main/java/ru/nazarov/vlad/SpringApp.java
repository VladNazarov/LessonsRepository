package ru.nazarov.vlad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Rakhmankulov Ed
 */
public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ru/nazarov/vlad/annotationContext.xml");

        NotificationService notificationService = context.getBean(NotificationService.class);

        for (int i = 0; i < 100; i++) {
            notificationService.notify("i foo bar\n");
        }
    }
}
