public class Bart extends Player {
    public Bart() {
        super();
        super.setName("Bart");
    }

    // Poor Bart, he always goes with rock
    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}