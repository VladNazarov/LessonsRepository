package org.nazarov.vlad.delivery.model;

/**
 * курьер выполняющий доставку
 *
 * @author Rakhmankulov Ed
 */

public final class Courier extends AbstractEntity {

    public Courier(String id, String name) {
        super(id, name);
    }

    public void doDelivery(Order order, String storageAddress){
        //Примерная логика:
        String name = this.getName();
        System.out.println("Courier "+name+" go to "+ storageAddress);
        System.out.println("Courier "+name+" get "+order.getName());
        System.out.println("Courier "+name+" go to "+order.getConsumerAddress());
        System.out.println("Courier "+name+" give "+order.getName());
    }

}
