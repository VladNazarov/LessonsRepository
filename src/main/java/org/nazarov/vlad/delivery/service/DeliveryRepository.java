package org.nazarov.vlad.delivery.service;

import lombok.Getter;
import org.nazarov.vlad.delivery.model.AbstractEntity;
import org.nazarov.vlad.delivery.model.Consumer;
import org.nazarov.vlad.delivery.model.Courier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Getter
@Repository
public class DeliveryRepository {
    private Map<String, Courier> couriers;
    private Map<String, Consumer> consumers;

    @Autowired
    public DeliveryRepository(Map<String, Courier> couriers, Map<String, Consumer> consumers) {
        this.couriers = couriers;
        this.consumers = consumers;
    }

    public Courier getCourier(String id) {
        return couriers.get(id);

    }

    public Consumer getConsumer(String id) {
        return consumers.get(id);
    }


    public boolean addEntity(AbstractEntity entity) {
        if (entity instanceof Courier) {
            if (!couriers.containsKey(entity.getId())) {
                couriers.put(entity.getId(), (Courier) entity);
                return true;
            } else {
                return false;
            }
        } else if (entity instanceof Consumer) {
            if (!consumers.containsKey(entity.getId())) {
                consumers.put(entity.getId(), (Consumer) entity);
                return true;
            } else {
                return false;
            }
        } else {
            throw new RuntimeException("Incorrect entity!");
        }
    }

    public void deleteConsumer(String id) {
        consumers.remove(id);

    }

    public void deleteCourier(String id) {
        couriers.remove(id);

    }


}
