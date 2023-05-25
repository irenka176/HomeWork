public class Robot extends Participant{
    @Override
    void Run(int path) {
        //super.Run(path);
        System.out.println("Robot class method Run");
    }

    @Override
    void Jump(int path) {
        //super.Jump(path);
        System.out.println("Robot class method Jump");
    }
}
