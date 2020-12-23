package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.Storage;
import org.springframework.stereotype.Component;

@Component
public class StorageRepositoryImpl extends AbstractRepositoryImpl<Storage> implements StorageRepository {
    @Override
    public boolean updateEntityById(String id, Storage entity) {
        throw new UnsupportedOperationException();
    }
}
