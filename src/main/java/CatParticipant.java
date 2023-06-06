public class CatParticipant extends Participant{
    @Override
    void run(int path) {
       // super.Run(path);
        System.out.println("CatParticipant class method run");
    }

    @Override
    void jump(int path) {
        //super.Jump(path);
        System.out.println("CatParticipant class method Jump");
    }
}
