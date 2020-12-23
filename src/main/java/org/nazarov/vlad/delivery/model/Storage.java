package org.nazarov.vlad.delivery.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Storage extends AbstractEntity {
    private String address;

    public Storage(String id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    public boolean orderIsReady(Order id) {
        throw new UnsupportedOperationException();
    }
}
