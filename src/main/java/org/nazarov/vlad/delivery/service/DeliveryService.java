package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.Consumer;
import org.nazarov.vlad.delivery.model.Courier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    private final DeliveryRepository<Courier> courierRepository;
    private final DeliveryRepository<Consumer> consumerRepository;

    @Autowired
    public DeliveryService(DeliveryRepository<Courier> courierRepository, DeliveryRepository<Consumer> consumerRepository) {
        this.courierRepository = courierRepository;
        this.consumerRepository = consumerRepository;
    }

    public void doDelivery() {

    }

}
