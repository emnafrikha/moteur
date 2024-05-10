import java.util.Map;
import java.util.List;

public class Scoreur{
 private double calculerScore(Map<String, Integer> occurrences, List<String> requete) {
    double score = 0;
    int totalMotsRequete = requete.size();

    for (String mot : requete) {
        int occurrenceMotDansFichier = occurrences.getOrDefault(mot, 0);
        score += (double) occurrenceMotDansFichier / totalMotsRequete;
    }

    return score;
}}