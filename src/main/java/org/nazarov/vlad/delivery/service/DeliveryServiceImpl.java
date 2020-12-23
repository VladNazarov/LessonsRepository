package org.nazarov.vlad.delivery.service;

import org.nazarov.vlad.delivery.model.Consumer;
import org.nazarov.vlad.delivery.model.Courier;
import org.nazarov.vlad.delivery.model.Order;
import org.nazarov.vlad.delivery.model.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    private final CourierRepository courierRepository;
    private final ConsumerRepository consumerRepository;
    private final OrderRepository orderRepository;
    private final StorageRepository storageRepository;

    @Autowired
    public DeliveryServiceImpl(CourierRepository courierRepository, ConsumerRepository consumerRepository, OrderRepository orderRepository, StorageRepository storageRepository) {
        this.courierRepository = courierRepository;
        this.consumerRepository = consumerRepository;
        this.orderRepository = orderRepository;
        this.storageRepository = storageRepository;
    }


    @Override
    public void doDelivery() {
        ////Примерная логика:
        Consumer consumer = consumerRepository.getEntityById("1");/////Получить заказчика
        Order order = orderRepository.getEntityById(consumer.getOrderId());
        Storage storage = storageRepository.getEntityById(order.getStorageId());

        if(storage.orderIsReady(order)){////Проверить готовность заказа
            Courier courier = courierRepository.getEntityById("1");////Найти курьера
            courier.doDelivery(order,storage.getAddress());///Дать поручение выполнять
        }
        if(order.isCompleted()){
            orderRepository.removeEntityById(order.getId());
            consumerRepository.removeEntityById(consumer.getId());
        }
    }

}
