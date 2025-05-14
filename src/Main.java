import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Produit> liste = Arrays.asList(
            new Produit(1, "Pomme", 1.5),
            new Produit(2, "Poire", 2.0),
            new Produit(3, "Orange", 1.2),
            new Produit(4, "Ananas", 3.0),
            new Produit(5, "Banane", 1.1)
        );

        ProduitService service = new ProduitService(liste);

        System.out.println("📋 Liste des produits :");
        service.afficherTous();

        System.out.println("\n🔽 Produits triés par prix croissant :");
        service.trierParPrix();

        System.out.println("\n💰 Produits à moins de 2€ :");
        service.filtrerMoinsDe(2.0);

        System.out.println("\n🔤 Noms des produits en MAJUSCULES :");
        service.afficherNomsMajuscules();

        System.out.println("\n💵 Total des prix : " + service.totalPrix() + " €");

        service.plusCher().ifPresent(p ->
            System.out.println("\n⭐ Produit le plus cher : " + p)
        );

        System.out.println("\n🔠 Produits groupés par première lettre :");
        service.regrouperParLettreInitiale().forEach((lettre, produits) -> {
            System.out.println(lettre + " : " + produits);
        });
    }
}

