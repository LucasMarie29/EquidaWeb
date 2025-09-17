package model;


public class Client {
   
    private int id;
    private String titre;
    private String nom;
    private String prenom;
    private String adressePartie1;
    private String adressePartie2;
    private String rue;
    private int copos;
    private String ville;
    private String adresseMessagerie;
    
    private Pays pays;

    public Client() {
        super();
    }

    public Client(String titre, String nom, String prenom, String adressePartie1, String adressePartie2, String rue, int copos, String ville, String adresseMessagerie) {
        super();
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getRue() {
        return rue;
    }

    public void setCopos(int copos) {
        this.copos = copos;
    }

    public int getCopos() {
        return copos;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return ville;
    }

    public void setAdresseMessagerie(String adresseMessagerie) {
        this.adresseMessagerie = adresseMessagerie;
    }

    public String getAdresseMessagerie() {
        return adresseMessagerie;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Pays getPays() {
        return pays;
    }

    public String getAdressePartie1() {
        return adressePartie1;
    }

    public String getAdressePartie2() {
        return adressePartie2;
    }

    public void setAdressePartie1(String adressePartie1) {
        this.adressePartie1 = adressePartie1;
    }

    public void setAdressePartie2(String adressePartie2) {
        this.adressePartie2 = adressePartie2;
    }
    
    
    
    
}
