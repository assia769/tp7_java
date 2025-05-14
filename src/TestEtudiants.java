import java.util.*;
import java.util.stream.*;

public class TestEtudiants {
    public static void main(String[] args) {
        List<Etudiant> etudiants = Arrays.asList(
            new Etudiant("Ali", 14.5),
            new Etudiant("Sara", 11.0),
            new Etudiant("Karim", 16.2),
            new Etudiant("Lina", 9.8)
        );

        // Affichage
        System.out.println("Tous les étudiants :");
        etudiants.forEach(System.out::println);

        // Filtrer moyenne > 12
        System.out.println("\nÉtudiants avec moyenne > 12 :");
        etudiants.stream()
            .filter(e -> e.getMoyenne() > 12)
            .forEach(System.out::println);

        // Noms en MAJUSCULE
        System.out.println("\nNoms en majuscules :");
        etudiants.stream()
            .map(e -> e.getNom().toUpperCase())
            .forEach(System.out::println);

        // Moyenne générale
        double moyenneG = etudiants.stream()
            .mapToDouble(Etudiant::getMoyenne)
            .average()
            .orElse(0.0);
        System.out.println("\nMoyenne générale : " + moyenneG);

        // Noms regroupés
        String nomsConcat = etudiants.stream()
            .map(Etudiant::getNom)
            .collect(Collectors.joining(", "));
        System.out.println("\nTous les noms : " + nomsConcat);

        // Trié par moyenne croissante
        etudiants.sort((e1, e2) -> Double.compare(e1.getMoyenne(), e2.getMoyenne()));
        System.out.println("\nTriés par moyenne croissante :");
        etudiants.forEach(System.out::println);
    }
}
