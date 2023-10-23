package lesson10.coffee.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

class CoffeeOrderBoard {
    private static final Logger logger = LoggerFactory.getLogger(CoffeeOrderBoard.class);
    private List<Order> orderQueue = new ArrayList<>();

    public void add(String customerName) {
        Order order = new Order(customerName);
        orderQueue.add(order);
        logger.info("Add order");

    }

    public void deliver() {
        if (!orderQueue.isEmpty()) {
            Order nextOrder = orderQueue.remove(0);
            logger.info("Delivering order #" + nextOrder.getOrderNumber() + " for " + nextOrder.getCustomerName());
            System.out.println("Delivering order #" + nextOrder.getOrderNumber() + " for " + nextOrder.getCustomerName());
        } else {
            logger.info("No orders to deliver.");
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orderQueue.size(); i++) {
            Order order = orderQueue.get(i);
            if (order.getOrderNumber() == orderNumber) {
                logger.info("Delivering order #" + order.getOrderNumber() + " for " + order.getCustomerName());
                orderQueue.remove(i);
                return;
            }
        }
        logger.info("Order #" + orderNumber + " not found.");
        System.out.println("Order #" + orderNumber + " not found.");
    }

    public void draw() {
        System.out.println("Current order queue:");
        for (Order order : orderQueue) {
            System.out.println("Order #" + order.getOrderNumber() + " for " + order.getCustomerName());
        }
    }
}
