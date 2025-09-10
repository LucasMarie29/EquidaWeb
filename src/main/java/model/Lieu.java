package model;

import java.util.ArrayList;


public class Lieu {
    private int id;
    private String ville;
    private int nbBoxes;
    private String commentaires;
    
    private ArrayList<Vente> lesVentes;

    public Lieu() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return ville;
    }

    public void setNbBoxes(int nbBoxes) {
        this.nbBoxes = nbBoxes;
    }

    public int getNbBoxes() {
        return nbBoxes;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public ArrayList<Vente> getLesVentes() {
        return lesVentes;
    }

    public void setLesVentes(ArrayList<Vente> lesVentes) {
        this.lesVentes = lesVentes;
    }
    
    public void addVente (Vente uneVente){
        if (lesVentes ==null ){
            lesVentes = new ArrayList<Vente>();
        }
        lesVentes.add(uneVente);
    } 
    
    
     
}
