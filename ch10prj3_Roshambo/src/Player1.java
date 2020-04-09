public class Player1 extends Player {

    public Player1() {
        super();
    }

    // you must provide some implementation of this method
    // even though you don't need to use it
    @Override
    public Roshambo generateRoshambo() {
        return Roshambo.ROCK;
    }
}