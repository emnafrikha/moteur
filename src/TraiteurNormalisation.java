import java.util.List;
import java.util.ArrayList;

public class TraiteurNormalisation extends Traiteur {
    @Override
    public List<String> Traiter(List<String> texte) {
        // Créer une nouvelle liste pour stocker les mots normalisés
        List<String> motsNormalises = new ArrayList<>();

        // Parcourir la liste de mots
        for (String mot : texte) {
            // Ajouter le mot en minuscules à la liste des mots normalisés
            motsNormalises.add(mot.toLowerCase());
        }

        return motsNormalises;
    }
}
