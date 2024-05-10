
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Analyseur2 extends Analyseur {
    public Map<String,Integer> analyser(List<String> motFichier) {
        Map<String, Integer> comptageMap = new HashMap<>();
        for (String mot : motFichier) {
            Integer n=comptageMap.get(mot);
            if(n==null){;
                comptageMap.put(mot,1);
            }else{
                comptageMap.put(mot,n+1);
            }
        }
        return comptageMap;
    }
}

