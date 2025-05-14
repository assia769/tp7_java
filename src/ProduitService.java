
import java.util.*;
import java.util.stream.*;

public class ProduitService {
    private List<Produit> produits;

    public ProduitService(List<Produit> produits) {
        this.produits = produits;
    }

    // 1. Afficher tous les produits
    public void afficherTous() {
        produits.forEach(p -> System.out.println(p));
    }

    // 2. Trier par prix croissant
    public void trierParPrix() {
        produits.stream()
            .sorted(Comparator.comparingDouble(Produit::getPrix))
            .forEach(System.out::println);
    }

    // 3. Filtrer les produits < montant donné
    public void filtrerMoinsDe(double montant) {
        produits.stream()
            .filter(p -> p.getPrix() < montant)
            .forEach(System.out::println);
    }

    // 4. Afficher les noms en majuscules
    public void afficherNomsMajuscules() {
        produits.stream()
            .map(p -> p.getNom().toUpperCase())
            .forEach(System.out::println);
    }

    // 5. Calcul du total des prix
    public double totalPrix() {
        return produits.stream()
            .mapToDouble(Produit::getPrix)
            .sum();
    }

    // 6. Trouver le produit le plus cher
    public Optional<Produit> plusCher() {
        return produits.stream()
            .max(Comparator.comparingDouble(Produit::getPrix));
    }

    // 7. Regrouper par première lettre
    public Map<String, List<Produit>> regrouperParLettreInitiale() {
        return produits.stream()
            .collect(Collectors.groupingBy(p -> p.getNom().substring(0, 1).toUpperCase()));
    }
}
