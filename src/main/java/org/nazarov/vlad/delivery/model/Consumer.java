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
    private String orderId;

    public Consumer(String id, String name, String orderId) {
        super(id, name);
        this.orderId = orderId;
    }

}
