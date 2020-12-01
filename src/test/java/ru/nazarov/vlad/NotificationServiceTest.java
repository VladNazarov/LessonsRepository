package ru.nazarov.vlad;

import org.junit.jupiter.api.BeforeAll;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rakhmankulov Ed
 */
class NotificationServiceTest {
    NotificationService notificationService;

    @BeforeAll
    public void setUp() {
        Consumer<String> testConsumer = s -> {};
        notificationService = new NotificationService(testConsumer);
    }
}