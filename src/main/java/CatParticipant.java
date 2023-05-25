public class CatParticipant extends Participant{
    @Override
    void Run(int path) {
       // super.Run(path);
        System.out.println("CatParticipant class method run");
    }

    @Override
    void Jump(int path) {
        //super.Jump(path);
        System.out.println("CatParticipant class method Jump");
    }
}
