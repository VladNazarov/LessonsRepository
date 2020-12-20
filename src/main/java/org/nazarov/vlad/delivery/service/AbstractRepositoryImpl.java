package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.AbstractEntity;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractRepositoryImpl<T extends AbstractEntity> implements AbstractRepository<T> {
    private final Map<String, T> entityMap = new ConcurrentHashMap<>();

    @Override
    public T getEntityById(String id) {
        return entityMap.getOrDefault(id, null);
    }

    @Override
    public boolean addEntity(T entity) {
        if (!entityMap.containsKey(entity.getId())) {
            entityMap.put(entity.getId(), entity);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean removeEntityById(String id) {
        return entityMap.remove(id) != null;
    }

    @Override
    public abstract boolean updateEntityById(String id, T entity);
}
