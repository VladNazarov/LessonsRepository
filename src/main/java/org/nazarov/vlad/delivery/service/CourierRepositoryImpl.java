package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.Courier;
import org.springframework.stereotype.Component;

/**
 * имплементация репозитория с курьерами
 *
 * @author Rakhmankulov Ed
 */
@Component
public class CourierRepositoryImpl extends AbstractRepositoryImpl<Courier> implements CourierRepository {

    @Override
    public boolean updateEntityById(String id, Courier entity) {
        throw new UnsupportedOperationException();
    }
}
