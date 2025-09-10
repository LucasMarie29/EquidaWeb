package model;

import java.util.ArrayList;


public class Acheteur {
    private String formation;
    
    private ArrayList<Enchere> lesEncheres;

    public Acheteur() {
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
}
