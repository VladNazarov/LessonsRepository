package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.Consumer;
import org.nazarov.vlad.delivery.model.Courier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    private final CourierRepository courierRepository;
    private final ConsumerRepository consumerRepository;

    @Autowired
    public DeliveryServiceImpl(CourierRepository courierRepository, ConsumerRepository consumerRepository) {
        this.courierRepository = courierRepository;
        this.consumerRepository = consumerRepository;
    }


    @Override
    public void doDelivery() {}

}
