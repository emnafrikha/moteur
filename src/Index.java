import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Index {
    private Map<string,stat> 
    

    // Méthode pour ajouter une Stat à la liste
     public void ajouterStat(String mot, String chemin, int occurrences) {
     Stat stat = trouverStat(mot, chemin);
     if (stat != null) {
     stat.incrementerOccurences();
     } else {
     stats.add(new Stat(mot, chemin, occurrences));
     }
     }

    // Méthode pour trouver une Stat dans la liste
    private Stat trouverStat(String mot, String chemin) {
        for (Stat stat : stats) {
            if (stat.getMot().equals(mot) && stat.getChemin().equals(chemin)) {
                return stat;
            }
        }
        return null;
    }

    // Optionnellement, vous pouvez ajouter une méthode pour obtenir la liste des
    // stats
    public List<Stat> getStats(String mot) {
        List<Stat> resultats = new ArrayList<>();
        for (Stat stat : stats) {
            if (stat.getMot().equals(mot)) {
                resultats.add(stat);
            }
        }
        return resultats;
    }
}
