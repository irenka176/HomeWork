package lesson10.coffee.order;

public class OraderNotFoundException extends Exception {
    public OraderNotFoundException(String message, int orderNumber) {
        super(message);
    }
}