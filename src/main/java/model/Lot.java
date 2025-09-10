package model;

import java.util.ArrayList;


public class Lot {
    private int id;
    private int prixDepart;
    
    private Cheval cheval;
    
    private ArrayList<Enchere> lesEncheres;
   

    public Lot() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public Cheval getCheval() {
        return cheval;
    }

    public void setCheval(Cheval cheval) {
        this.cheval = cheval;
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
