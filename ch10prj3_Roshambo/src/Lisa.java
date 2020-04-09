public class Lisa extends Player {

    public Lisa() {
        super();
        super.setName("Lisa");
    }

    // Lisa randomly selects rock, paper, or scissors
    @Override
    public Roshambo generateRoshambo() {
        // get random int from 0 to 2
        int i = (int) (Math.random() * 3);

        // return x
        if (i == 0) {
            return Roshambo.ROCK;
        } else if (i == 1) {
            return Roshambo.PAPER;
        } else{
            return Roshambo.SCISSORS;
        }
    }
}