public class Produit {
    private int id;
    private String nom;
    private double prix;

    public Produit(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public double getPrix() { return prix; }

    @Override
    public String toString() {
        return id + " - " + nom + " : " + prix + " €";
    }
}

