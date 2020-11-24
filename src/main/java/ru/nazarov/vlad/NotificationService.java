package ru.nazarov.vlad;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

/**
 * todo описание
 *
 * @author Rakhmankulov Ed
 */
@Component
public class NotificationService {
    private final Consumer<String> notificationConsumer;

    public NotificationService(@Qualifier("fileConsumer") Consumer<String> notificationConsumer) {
        this.notificationConsumer = notificationConsumer;
    }


    public void notify(String message) {
        notificationConsumer.accept(message);
    }
}
