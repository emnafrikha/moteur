import java.util.List;
import java.util.ArrayList;

public class TraiteurNormalisation extends Traiteur {
    public List<String> Traiter(List<String> texte) {
        List<String> motsNormalises = new ArrayList<>(); // Créer une nouvelle liste pour stocker les mots normalisés
        for (String mot : texte) { // Parcourir la liste de mots
            motsNormalises.add(mot.toLowerCase()); // Ajouter le mot en minuscules à la liste des mots normalisés
        }

        return motsNormalises;
    }
}
