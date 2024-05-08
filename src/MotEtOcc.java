public class MotEtOcc{

    private String mot;
    private int occurence;

    // Constructeur
    public MotEtOcc(String mot, int occurence) {
        this.mot = mot;
        this.occurence = occurence;
    }

    // Méthodes getters et setters
    public String getMot() {
        return mot;
    }

    public int getOccurence() {
        return occurence;
    }

    public void incrementer() {
        occurence++; // Incrémente le nombre d'occurrences
    }

}