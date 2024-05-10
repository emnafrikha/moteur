public class Stat {
    private String mot;
    private String chemin;
    private int occurences;

    public Stat(String mot, String chemin, int occurences) {
        this.mot = mot;
        this.chemin = chemin;
        this.occurences = occurences;
    }

    public String getMot() {
        return mot;
    }

    public String getChemin() {
        return chemin;
    }

    public int getOccurences() {
        return occurences;
    }

    public void incrementerOccurences() {
        occurences++;
    }
}