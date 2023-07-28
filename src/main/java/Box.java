import java.util.ArrayList;
import java.util.Collections;

/**
 * Box
 */
public class Box<T extends Fruit<T>> {
    protected final ArrayList<Fruit<T>> fruits = new ArrayList<>();

    /**
     * @param fruit (Fruit<T> fruit)
     */
    public void add(Fruit<T> fruit) {
        fruits.add(fruit);
    }

    /**
     * @param fruit (Fruit<T>[] fruit)
     */
    public void add(Fruit<T>[] fruit) {
        Collections.addAll(fruits, fruit);
    }

    public float getWeight() {
        var weight = 0.0F;
        for (var fruit : fruits) {
            weight += fruit.weight;
        }
        return weight;
    }

    /**
     * @param box1 (Box<T> box)
     * @param box2 (Box<T> box)
     */
    public boolean compare(Box<?> box1, Box<?> box2) {
        if (box1 == null) {
            throw new NullPointerException("box1 is null");
        }
        if (box2 == null) {
            throw new NullPointerException("box2 is null");
        }
        return box1.getWeight() == box2.getWeight();
    }

    public void merge(Box<T> box) {
        if (box == null) {
            throw new NullPointerException("box is null");
        }
        // can't merge with itself
        if (box == this) {
            return;
        }
        fruits.addAll(box.fruits);
        //box.fruits.clear();
    }
}
