package lesson10.coffee.order;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Alice");
        orderBoard.add("Bob");
        orderBoard.add("Charlie");

        orderBoard.draw();

        orderBoard.deliver();
        orderBoard.deliver();

        orderBoard.draw();

        orderBoard.deliver(2);
        orderBoard.deliver(1);

        orderBoard.draw();
    }
}