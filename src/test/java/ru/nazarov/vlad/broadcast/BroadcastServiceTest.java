package ru.nazarov.vlad.broadcast;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.nazarov.vlad.model.Event;
import ru.nazarov.vlad.model.Importance;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author Rakhmankulov Ed
 */
class BroadcastServiceTest {
    private static final String MESSAGE = "message";
    private static final String TITLE = "title";
    BroadcastService broadcastService;
    CommunicationLine fatalCommunicationLine;
    CommunicationLine criticalCommunicationLine;

    @BeforeEach
    public void setUp() {
        criticalCommunicationLine = Mockito.mock(CommunicationLine.class);
        fatalCommunicationLine = Mockito.mock(CommunicationLine.class);

        HashMap<Importance, List<CommunicationLine>> config = new HashMap<>();
        config.put(Importance.FATAL, Arrays.asList(fatalCommunicationLine));
        config.put(Importance.CRITICAL, Arrays.asList(criticalCommunicationLine));

        broadcastService = new BroadcastService(config);
    }

    @Test
    public void shouldCallCriticalCommLine() {
        Event event = new Event(TITLE, MESSAGE, Importance.CRITICAL);
        broadcastService.broadcast(event);
        verify(criticalCommunicationLine).broadcastAboutEvent(same(event));
        verify(fatalCommunicationLine, times(0)).broadcastAboutEvent(any());
    }
}