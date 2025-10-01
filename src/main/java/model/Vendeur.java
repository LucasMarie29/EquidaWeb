package model;


public class Vendeur extends Client {
    private int id;
    private String nom;

    public Vendeur() {
        super();
    }
    
    public Vendeur(String titre, String nom, String prenom, String adressePartie1, String adressePartie2, String rue, int copos, String ville, String adresseMessagerie) {
        super();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
  
}
