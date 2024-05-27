package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Order;

public class MainOrder {

    public static void main(String[] args) {
        Order order = new Order(1, 22.5, "Pizza", 4);

        System.out.println("Description: " + order.getDescription());
        System.out.println("UUID: " + order.getUuid());
        System.out.println("Formated Timestamp: " + order.getFormatedTimeStamp());
    }
}
