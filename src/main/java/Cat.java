public class Cat extends Animal{
    int barrierRun = 200;
    int barrierSwim  = 0;


    @Override
    void swim(int path) {
        super.swim(path);
        if (path >= barrierSwim){
            System.out.println("Кот не умеет плавать");
        }

    }

    @Override
    void run(int path) {
        super.run(path);
        if (path >= barrierRun){
            System.out.println("Кот больше не пробежит, а то сдохнет");
        }
        else
        {
            System.out.println("Кот пробежал "+ path);
        }
    }
}
