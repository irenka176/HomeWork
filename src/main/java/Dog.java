public class Dog extends Animal{
    int barrierRun = 500;
    int barrierSwim  = 10;
    @Override
    void Run(int path) {
        super.Run(path);
        if (path >= barrierRun){
            System.out.println("Пес больше не пробежит, а то сдохнет");
        }
        else
        {
            System.out.println("Пес пробежал "+ path);
        }
    }

    @Override
    void Swim(int path) {
        super.Swim(path);
        if(path >= barrierSwim){
            System.out.println("Пес больше не проплывет, а то сдохнет");
        }
        else
        {
            System.out.println("Пес проплыл "+ path);
        }
    }
}
