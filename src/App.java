import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("chat", "chien", "chat", "oiseau", "chien", "chat");

        Analyseur analyseur2 = new Analyseur2();
        Map<String, Integer> result2 = analyseur2.analyser(mots);
        System.out.println("Analyseur2:");
        System.out.println(result2);

        Analyseur analyseur3 = new Analyseur3();
        Map<String, Integer> result3 = analyseur3.analyser(mots);
        System.out.println("Analyseur3:");
        System.out.println(result3);
    }
}

// import java.util.List;
// import java.util.zip.ZipFile;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.BufferedReader;
// import java.io.IOException;

// public class App {
//     public static void main(String[] args) throws Exception {
        
        
//         // Chemin du fichier ZIP à traiter
//         String cheminFichierZip = "C:\\Users\\user\\Desktop\\tres_petit_corpus.zip";
        
//         // Création de l'index
//         Index index = new Index();

//         // Traitement de chaque fichier dans l'archive ZIP
//         try (ZipFile zipFile = new ZipFile(cheminFichierZip)) {
//             zipFile.stream().forEach(entry -> {
//                 try {
//                     // Lecture du fichier dans l'archive
//                     InputStream inputStream = zipFile.getInputStream(entry);
//                     BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//                     String ligne;
//                     while ((ligne = reader.readLine()) != null) {
//                         // Traitement des mots spéciaux
//                         TraiteurCarSpec traiteur1 = new TraiteurCarSpec();
//                         List<String> motsTraites = traiteur1.Traiter(List.of(ligne.split(" ")));

//                         // Traitement des mots vides
//                         TraiteurMotVide traiteur2 = new TraiteurMotVide();
//                         List<String> sansMotsVides = traiteur2.Traiter(motsTraites);

//                         // Analyse des mots et récupération des statistiques
//                         Analyseur analyseur = new Analyseur();
//                         List<MotEtOcc> statistiques = analyseur.analyser(sansMotsVides);

//                         // Ajout des statistiques à l'index
//                         for (MotEtOcc motOcc : statistiques) {
//                             index.ajouterStat(motOcc.getMot(), entry.getName(), motOcc.getOccurence());
//                         }
//                     }
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             });
//         }

//         // Utilisation de l'index pour obtenir les statistiques d'un mot spécifique
//         String motRecherche = "spell"; // Remplacez "exemple" par le mot que vous souhaitez rechercher
//         List<Stat> statsMotRecherche = index.getStats(motRecherche);
//         for (Stat stat : statsMotRecherche) {
//             System.out.println("Mot: " + stat.getMot() + ", Fichier: " + stat.getChemin() + ", Occurrences: " + stat.getOccurences());
//         }
//     }
// }
