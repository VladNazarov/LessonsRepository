package ru.nazarov.vlad.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Событие
 *
 * @author Rakhmankulov Ed
 */
@Getter
@AllArgsConstructor
public final class Event {
    private final String title;
    private final String message;
    private final Importance importance;
}
