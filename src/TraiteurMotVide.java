import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TraiteurMotVide extends Traiteur{
	private static final List<String> mots_vides = Arrays.asList("the","s", "of", "to", "and", "in", "a", "is", "it", "that", "for", "on", "with", "as", "at", "by", "from", "be", "this", "an", "will", "you", "not", "or");
   
	public List<String> Traiter(List<String> texte) {
	        List<String> motsnettoyes = new ArrayList<>();
	        for (String mot : texte) {
	            if (!estMotVide(mot)) {
	                motsnettoyes.add(mot);
	            }
	        }
	        return motsnettoyes;
	    }

	    private boolean estMotVide(String mot) {
	        return mots_vides.contains(mot.toLowerCase());
	    }
}
