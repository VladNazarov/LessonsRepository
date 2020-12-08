package ru.nazarov.vlad.broadcast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nazarov.vlad.model.Event;
import ru.nazarov.vlad.model.Importance;

import java.util.List;
import java.util.Map;

/**
 * сообщает о событиях по всем релевантым каналам связи
 *
 * @author Rakhmankulov Ed
 */
@Service
public class BroadcastService {
    private final Map<Importance, List<CommunicationLine>> communicationLinesConfiguration;

    @Autowired
    public BroadcastService(Map<Importance, List<CommunicationLine>> communicationLinesConfiguration) {
        this.communicationLinesConfiguration = communicationLinesConfiguration;
    }

    void broadcast(Event event) {
        Importance importance = event.getImportance();
        List<CommunicationLine> communicationLines = communicationLinesConfiguration.get(importance);
        if (communicationLines !=null) {
            communicationLines.forEach(cl -> cl.broadcastAboutEvent(event));
        } else {
            System.out.println("for event = " + event + " there is no comm line!");
        }
    }
}
