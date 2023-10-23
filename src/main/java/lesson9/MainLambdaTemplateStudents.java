package lesson9;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import static lesson9.FruitType.*;
import static lesson9.Vitamin.*;
import static lesson9.Vitamin.C;


public class MainLambdaTemplateStudents {
    public static void main(String[] args) {
        List<Fruit> fruits = fillFruitsList();
        fruits.forEach(System.out::println);

        // task 1
        fruits.stream()
                .filter(x -> x.getVitamins().contains(Vitamin.A) || x.getVitamins().contains(Vitamin.C))
                .forEach(System.out::println);

        // task 2
        fruits.stream().map(Fruit::getVitamins).
                flatMap(Collection::stream).
                collect(Collectors.toSet()).
                stream().
                sorted().
                forEach(System.out::println);
        // task 3
        fruits.stream().collect(Collectors.groupingBy(Fruit::getFruitType)).
                forEach((k, v) -> System.out.println(k + " " + v.stream().mapToInt(Fruit::getPrice).min().orElse(0)));

        // task 4
        fruits.stream().
                sorted(Comparator.comparing(Fruit::getDayToLive).reversed()).
                limit(3)
                .map(Fruit::getFruitType).
                forEach(System.out::println);

        // task 5
        fruits.stream().collect(Collectors.groupingBy(Fruit::getFruitType))
                .forEach((k, v) -> System.out.println(k + " " + v.size()));

        // task 6
        HashMap<FruitType, List<Fruit>> fruitsMap =
                new HashMap<>(fruits.stream().collect(Collectors.groupingBy(Fruit::getFruitType)));
        System.out.println(fruitsMap);
    }

    public static List<Fruit> fillFruitsList() {
        List<Fruit> fruits = new ArrayList<>();

        Fruit fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 15, LocalDate.of(2019, 1, 2), 50, null);
        fruit.setVitamins(List.of(A, C));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 30, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B1, B2, C));
        fruits.add(fruit);

        fruit = new Fruit(ORANGE, 60, LocalDate.of(2019, 1, 3), 30, null);
        fruit.setVitamins(List.of(E, B, A));
        fruits.add(fruit);

        fruit = new Fruit(STRAWBERRY, 25, LocalDate.of(2019, 1, 2), 60, null);
        fruit.setVitamins(List.of(A, C, D));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 15, LocalDate.of(2019, 1, 4), 40, null);
        fruit.setVitamins(List.of(A, B, B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(PEAR, 5, LocalDate.of(2019, 1, 6), 10, null);
        fruit.setVitamins(List.of(B1, B2, P));
        fruits.add(fruit);

        fruit = new Fruit(APPLE, 30, LocalDate.of(2019, 1, 4), 12, null);
        fruit.setVitamins(List.of(B, C));
        fruits.add(fruit);

        return fruits;
    }
}
