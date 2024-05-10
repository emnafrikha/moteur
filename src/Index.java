import java.util.HashMap;
import java.util.Map;

public class Index {
    private Map<String, Stat> index = new HashMap<>();

    // Méthode pour ajouter une Stat à l'index
    public void ajouterStat(String mot, String chemin, int occurrences) {
        // Vérifier si le mot existe déjà dans l'index
        if (index.containsKey(mot)) {
            // Récupérer la Stat associée au mot
            Stat stat = index.get(mot);
            // Incrémenter les occurrences de la Stat
            stat.incrementerOccurences();
        } else {
            // Si le mot n'existe pas encore dans l'index, créer une nouvelle Stat
            Stat newStat = new Stat(mot, chemin, occurrences);
            // Ajouter la nouvelle Stat à l'index
            index.put(mot, newStat);
        }
    }

    // Méthode pour obtenir la Stat associée à un mot
    public Stat getStat(String mot) {
        return index.get(mot);
    }
}
