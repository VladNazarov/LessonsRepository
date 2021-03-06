package ru.nazarov.vlad.broadcast;

import org.springframework.stereotype.Component;
import ru.nazarov.vlad.model.Event;
import ru.nazarov.vlad.model.Importance;

import java.util.Arrays;
import java.util.List;

/**
 * todo описание
 *
 * @author Rakhmankulov Ed
 */
@Component
public class YoutubeCommunicationLine implements CommunicationLine, IHasImportance {
    @Override
    public void broadcastAboutEvent(Event event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Importance> importance() {
        return Arrays.asList(Importance.TRIVIAL, Importance.MINOR, Importance.MAJOR);
    }
}
