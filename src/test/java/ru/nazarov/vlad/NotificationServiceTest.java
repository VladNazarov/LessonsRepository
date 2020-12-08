package ru.nazarov.vlad;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

/**
 * @author Rakhmankulov Ed
 */
class NotificationServiceTest {
    private static final String TEST_MESSAGE = "test message";
    NotificationService notificationService;
    Consumer<String> testConsumer;

    @BeforeEach
    public void setUp() {
        testConsumer = Mockito.mock(Consumer.class);
        notificationService = new NotificationService(testConsumer);
    }

    @Test
    public void shouldCallConsumer() {
        notificationService.notify(TEST_MESSAGE);
        verify(testConsumer, times(1)).accept(TEST_MESSAGE);
        verifyNoMoreInteractions(testConsumer);
    }
}