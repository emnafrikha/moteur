
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Analyseur3 extends Analyseur {
  
    public Map<String,Integer> analyser(List<String> motFichier) {
        Map<String, Integer> occurrenceMap = new TreeMap<>();
        for (String mot : motFichier) {
            Integer n=occurrenceMap.get(mot);
            if(n==null){;
                occurrenceMap.put(mot,1);
            }else{
                occurrenceMap.put(mot,n+1);
            }
        }
        return occurrenceMap;
    }
}