public class Wall extends Barrier{
    @Override
    void Overcome(Participant participant) {
        participant.Jump(10);
        System.out.println(participant.getClass().getName() + " overcomes " + this.getClass().getName());
    }
}
