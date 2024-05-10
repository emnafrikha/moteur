import java.util.List;
import java.util.ArrayList;

public class AnalyseurList{
  public List<MotEtOcc> analyser(List<String> motFichier){ 
   
        List<MotEtOcc> StatFichier = new ArrayList<MotEtOcc>();
        for (String mot : motFichier) {
            boolean motExiste = false;
            
            
            // Recherche si le mot existe déjà dans StatFichier
            for (MotEtOcc motOcc : StatFichier) {
                if (motOcc.getMot().equals(mot)) {
                    motOcc.incrementer(); // Incrémente le nombre d'occurrences
                    motExiste = true;
                    break;
                }
            }
            
            // Si le mot n'existe pas encore, l'ajouter à StatFichier avec une occurrence de 1
            if (!motExiste) {
                StatFichier.add(new MotEtOcc(mot, 1));
            }
        }
        
        return StatFichier;
}
}