
package Exercice4;

/**
 *
 * @author Maxime BLAISE
 */
public class Technicien extends Employe {

    /**
     * Nombre d'unités produites
     */
    private int nb_unite_produite;
    
    // Attributs statiques
    public static int BASE = 1000;
    public static int PART = 100;
    public static int GAIN_UNITE = 5;
    

    public Technicien(int nb_unite_produite, String nom, String prenom, String adresse, int age, int anciennete) {
        super(nom, prenom, adresse, age, anciennete);
        this.nb_unite_produite = nb_unite_produite;
    }
    
    
    @Override
    public double calculer_base_salaire() {
        return Technicien.BASE + this.nb_unite_produite * Technicien.PART * Technicien.GAIN_UNITE;
    }

    @Override
    public double calculer_salaire() {
        // Salaire de base
        double base = calculer_base_salaire();
        // +10% par année d'ancienneté
        return base + base * this.getAnciennete() / 10;
    }

    public int getNb_unite_produite() {
        return nb_unite_produite;
    }

    public void setNb_unite_produite(int nb_unite_produite) {
        this.nb_unite_produite = nb_unite_produite;
    }
 
    
}
