package model;


public class Lieu {
    private int id;
    private String ville;
    private int nbBoxes;
    private String commentaires;

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

    
    
    
     
}
