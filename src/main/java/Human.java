public class Human extends Participant{
    @Override
    void Run(int path) {
        //super.Run(path);
        System.out.println("Human class method run");
    }

    @Override
    void Jump(int path) {
        //super.Jump(path);
        System.out.println("Human class method Jump");
    }
}
