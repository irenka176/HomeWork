package lesson10.coffee.order;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.ArrayList;
import java.util.List;

class Order {
    private static int orderNumberCounter = 1;
    private int orderNumber;
    private String customerName;

    public Order(String customerName) {
        this.orderNumber = orderNumberCounter++;
        this.customerName = customerName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}