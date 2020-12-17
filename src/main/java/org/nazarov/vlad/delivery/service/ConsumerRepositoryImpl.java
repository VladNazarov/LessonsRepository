package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * имлементация репозитория потребителей
 *
 * @author Rakhmankulov Ed
 */
@Component
public class ConsumerRepositoryImpl extends AbstractRepositoryImpl<Consumer> implements ConsumerRepository {

    @Override
    public boolean updateEntityById(String id, Consumer entity) {
        throw new UnsupportedOperationException();
    }
}
