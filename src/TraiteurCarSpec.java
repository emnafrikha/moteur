import java.util.List;
import java.util.ArrayList;

public class TraiteurCarSpec extends Traiteur{
        public List<String> Traiter(List<String> texte){
             List<String> motsSansPon = new ArrayList<>(); //creation d'une liste dynamique pour mettre les mots nettoyes
                for (String mot : texte) {
                    String motnettoye = enleverPunctuation(mot);
                    if (!motnettoye.isEmpty()) { //ajouter les mots non vides seulement
                        motsSansPon.add(motnettoye);
                    }
                }
                return motsSansPon;
            }
    
            private String enleverPunctuation(String mot) {
                String ponctuation = "[\\p{Punct}&&[^']]+";
                return mot.replaceAll(ponctuation, "");
            }
        }
    
    

