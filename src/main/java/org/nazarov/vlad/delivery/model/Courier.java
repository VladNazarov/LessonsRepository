package org.nazarov.vlad.delivery.model;

import java.util.ArrayList;
import java.util.List;

/**
 * курьер выполняющий доставку
 *
 * @author Rakhmankulov Ed
 */

public final class Courier extends AbstractEntity {
    private List<Consumer> consumerList;

    public Courier(String id, String name) {
        super(id, name);
        this.consumerList = new ArrayList<>();
    }

    public void addConsumer(Consumer consumer) {
        consumerList.add(consumer);
    }

    public void deleteConsumer(String id) {
        if(!consumerList.isEmpty()){
            consumerList.remove(id);
        }
    }

    public void doDelivery(){

    }

    @Override
    public String toString() {
        return "Courier{" +
                "consumerList=" + consumerList +
                '}';
    }
}
