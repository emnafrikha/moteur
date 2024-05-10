import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Scoreur {
    private TraiteurCarSpec traiteurCarSpec = new TraiteurCarSpec();
    private TraiteurMotVide traiteurMotVide = new TraiteurMotVide();
    private TraiteurNormalisation traiteurNormalisation = new TraiteurNormalisation();
    private Analyseur analyseur = new Analyseur();

    public List<String> traiterMots(String phraseRecherche) {
        // Transformation de la phrase de recherche en liste de mots
        String[] motsRecherche = phraseRecherche.split(" ");
        List<String> motsRechercheListe = Arrays.asList(motsRecherche);

        // Traitement des caractères spéciaux
        List<String> motsSansPonctuation = traiteurCarSpec.Traiter(motsRechercheListe);

        // Traitement des mots vides
        List<String> motsSansMotsVides = traiteurMotVide.Traiter(motsSansPonctuation);

        // Normalisation des mots
        List<String> motsNormalises = traiteurNormalisation.Traiter(motsSansMotsVides);

        return motsNormalises;
    }
}
