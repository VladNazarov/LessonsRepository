package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class DeliveryRepository<T extends AbstractEntity> {
    private final Map<String, T> entityMap;

    @Autowired
    public DeliveryRepository(Map<String, T> entityMap) {
        this.entityMap = entityMap;
    }

    public T getEntity(String id) {
        return entityMap.getOrDefault(id, null);
    }

    public boolean addEntity(T entity) {
        if (!entityMap.containsKey(entity.getId())) {
            entityMap.put(entity.getId(), entity);
            return true;
        } else {
            return false;
        }

    }

    public void deleteEntity(String id) {
        entityMap.remove(id);
    }

    public List<T> getListOfEntities() {
        return new ArrayList<>(entityMap.values());
    }
}
