public class RunWay extends Barrier {
    @Override
    void Overcome(Participant participant) {
        participant.run(10);
        System.out.println(participant.getClass().getName() + " overcomes " + this.getClass().getName());
    }
}