public class AnimalMain {
    public static void main(String[] args) {
        /*
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.Swim(10);
        cat.Run(10);
        dog.Swim(150);
        dog.Run(200);
        */

        // create array of interfaces
        InterfaceFigure  figures [] = new InterfaceFigure[3];

        //added object to array by index
        figures[0] = new Circle();
        figures[1] = new Triangle();
        figures[2] = new Square();

        // start sum of all figures
        double sAll = 0.0;

        //cycle
        for (int i = 0; i<figures.length; i++){
            // get object with interface and call his method
            double s = figures[i].getSquire();
            // apply sum of figures
            sAll = sAll + s;
        }

        System.out.println("area of figures: " + sAll);
        }
    }

