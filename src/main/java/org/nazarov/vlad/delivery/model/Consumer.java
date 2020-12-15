package org.nazarov.vlad.delivery.model;

import lombok.Getter;
import lombok.Setter;

/**
 * получатель доставки
 *
 * @author Rakhmankulov Ed
 */
@Getter
@Setter
public class Consumer extends AbstractEntity {
    private String order;

    public Consumer(String id, String name, String order) {
        super(id, name);
        this.order = order;
    }

}
