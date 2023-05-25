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

        // array of Participants
        Participant participant [] = new Participant[3];
        Barrier barriers []  = new Barrier[2];

        // added objects to participant array
        participant[0] = new CatParticipant();
        participant[1] = new Human();
        participant[2] = new Robot();

        //added objects to array of barriers
        barriers[0] = new RunWay();
        barriers[1]  = new Wall();

        for (int i=0; i < participant.length; i++){
            Participant p =  participant[i];
            for(int j=0; j < barriers.length; j++){
                Barrier b = barriers[j];
                b.Overcome(p);
            }
        }
        }
    }

