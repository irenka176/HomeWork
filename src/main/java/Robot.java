public class Robot extends Participant{
    @Override
    void run(int path) {
        //super.Run(path);
        System.out.println("Robot class method Run");
    }

    @Override
    void jump(int path) {
        //super.Jump(path);
        System.out.println("Robot class method Jump");
    }
}
