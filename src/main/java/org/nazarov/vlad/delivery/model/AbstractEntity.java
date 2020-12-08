package org.nazarov.vlad.delivery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author Rakhmankulov Ed
 */
@Getter
@AllArgsConstructor
public class AbstractEntity {
    private final String id;
    private final String name;
}
