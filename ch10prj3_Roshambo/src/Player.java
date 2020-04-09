public abstract class Player {
    private String name;
    private Roshambo rsb;

    public Player() {
        name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoshambo(Roshambo rsb) {
        this.rsb = rsb;
    }

    public Roshambo getRoshambo() {
        return rsb;
    }

    public abstract Roshambo generateRoshambo();
}