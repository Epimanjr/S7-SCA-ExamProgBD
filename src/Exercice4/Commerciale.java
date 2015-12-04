/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice4;

/**
 *
 * @author Marine
 */
public class Commerciale extends Employe {
    double chiffreAffaire;
    public static double BASE=100;
    public static double PART=200;

    public Commerciale(double chiffreAffaire, String nom, String prenom, String adresse, int age, int anciennete) {
        super(nom, prenom, adresse, age, anciennete);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculer_base_salaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculer_salaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
