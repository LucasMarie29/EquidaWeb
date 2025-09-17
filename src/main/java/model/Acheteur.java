package model;

import java.util.ArrayList;


public class Acheteur extends Client{
    private int id;
    private String formation;
    
    private ArrayList<Enchere> lesEncheres;

    public Acheteur() {
        super();
    }
    
    public Acheteur(String titre, String nom, String prenom, String adressePartie1, String adressePartie2, String rue, int copos, String ville, String adresseMessagerie) {
        super();
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public ArrayList<Enchere> getLesEncheres() {
        return lesEncheres;
    }

    public void setLesEncheres(ArrayList<Enchere> lesEncheres) {
        this.lesEncheres = lesEncheres;
    }
    
    public void addEnchere (Enchere unEnchere){
        if (lesEncheres ==null ){
            lesEncheres = new ArrayList<Enchere>();
        }
        lesEncheres.add(unEnchere);
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
