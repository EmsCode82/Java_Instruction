public class RoshamboApp {
    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the game of Roshambo");
        System.out.println();

        // get the user input
        String name = Console.getString("Enter your name: ");
        System.out.println();

        Player1 player1 = new Player1();
        player1.setName(name);

        String opponent = Console.getString(
                "Would you like to play Bart or Lisa? (B/L): ", "b", "l");
        System.out.println();

        Player player2 = null;
        if (opponent.equalsIgnoreCase("b")) {
            player2 = new Bart();
        } else if (opponent.equalsIgnoreCase("l")) {
            player2 = new Lisa();
        }

        // continue until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String selection = Console.getString(
                    "Rock, paper, or scissors? (R/P/S): ", "r", "p", "s");
            System.out.println();

            // set Roshambo for player 1
            if (selection.equals("r")) {
                player1.setRoshambo(Roshambo.ROCK);
            } else if (selection.equals("p")) {
                player1.setRoshambo(Roshambo.PAPER);
            } else if (selection.equals("s")) {
                player1.setRoshambo(Roshambo.SCISSORS);
            }

            // set Roshambo for player 2
            Roshambo rsb = player2.generateRoshambo(); // Bart = rock; Lisa = random
            player2.setRoshambo(rsb);

            // display name and roshambo
            System.out.println(player1.getName() + ": " + player1.getRoshambo());
            System.out.println(player2.getName() + ": " + player2.getRoshambo());

            // display result
            play(player1, player2);
            System.out.println();

            choice = Console.getString("Play again? (y/n): ", "y", "n");
            System.out.println();
        }
    }

    private static void play(Player player1, Player player2) {
        if (player1.getRoshambo() == player2.getRoshambo()) {
            System.out.println("Draw!");
        } else {
            if (
                (player1.getRoshambo() == Roshambo.ROCK &&
                player2.getRoshambo() == Roshambo.SCISSORS) ||

                (player1.getRoshambo() == Roshambo.PAPER &&
                player2.getRoshambo() == Roshambo.ROCK) ||

                (player1.getRoshambo() == Roshambo.SCISSORS &&
                player2.getRoshambo() == Roshambo.PAPER)
            ) {
                System.out.println(player1.getName() + " wins!");
            } else {
                System.out.println(player2.getName() + " wins!");
            }
        }
    }
}