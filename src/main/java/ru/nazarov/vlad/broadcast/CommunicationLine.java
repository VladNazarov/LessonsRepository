package ru.nazarov.vlad.broadcast;

import ru.nazarov.vlad.model.Event;

/**
 * конал связи с населением
 *
 * @author Rakhmankulov Ed
 */
public interface CommunicationLine {

    void broadcastAboutEvent(Event event);
}
