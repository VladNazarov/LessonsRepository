package org.nazarov.vlad.delivery.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order extends AbstractEntity {
    private String consumerAddress;
    private String storageId;
    private String date;
    private boolean isCompleted;

    public Order(String id, String name, String address, String storageId) {
        super(id, name);
        this.consumerAddress = address;
        this.storageId = storageId;
    }
}
