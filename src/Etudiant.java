public class Etudiant {
    private String nom;
    private double moyenne;

    public Etudiant(String nom, double moyenne) {
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public String getNom() { return nom; }
    public double getMoyenne() { return moyenne; }

    @Override
    public String toString() {
        return nom + " - Moyenne : " + moyenne;
    }
}
