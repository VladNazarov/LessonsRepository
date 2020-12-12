package org.nazarov.vlad.delivery.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * получатель доставки
 *
 * @author Rakhmankulov Ed
 */
@Getter
@Setter
@Component
public class Consumer extends AbstractEntity {
    private String order;

    public Consumer(String id, String name, String order) {
        super(id, name);
        this.order = order;
    }

}
