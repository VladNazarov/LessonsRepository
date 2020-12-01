package ru.nazarov.vlad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.function.Consumer;

/**
 * @author Rakhmankulov Ed
 */
@Component
public class NotificationService {
    private Consumer<String> notificationConsumer;

    @Autowired
    public NotificationService(@Qualifier("fileConsumer") Consumer<String> notificationConsumer) {
        System.out.println("Creating Notification Service");
        this.notificationConsumer = notificationConsumer;
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct");
    }

    public void notify(String message) {
        notificationConsumer.accept(message);
    }
}
