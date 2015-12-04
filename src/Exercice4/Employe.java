
package Exercice4;

/**
 *
 * @author Maxime BLAISE
 * @author Marine ANGELONI
 */
public class Employe {
    
    /**
     * Nom de l'employé.
     */
    private String nom;
    
    /**
     * Prénom de l'employé.
     */
    private String prenom;
    
    /**
     * Adresse de l'employé.
     */
    private String adresse;
    
    /**
     * Age de l'employé.
     */
    private int age;
    
    /**
     * Nombre d'années de la personne dans l'entreprise.
     */
    private int anciennete;

    /**
     * Construit un employé.
     * 
     * @param nom String
     * @param prenom String
     * @param adresse String
     * @param age int
     * @param anciennete int
     */
    public Employe(String nom, String prenom, String adresse, int age, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
        this.anciennete = anciennete;
    }

    
    /* GETTERS AND SETTERS */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }
    
    
}
