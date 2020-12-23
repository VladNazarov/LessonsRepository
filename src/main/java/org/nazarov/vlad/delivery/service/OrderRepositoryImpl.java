package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderRepositoryImpl extends AbstractRepositoryImpl<Order> implements OrderRepository {
    @Override
    public boolean updateEntityById(String id, Order entity) {
        throw new UnsupportedOperationException();
    }
}
