package model;


public class CategVente {
    
    private int code;
    private String libelle;
    
    private CategVente categVente;

    public CategVente() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setCategVente(CategVente categVente) {
        this.categVente = categVente;
    }

    public CategVente getCategVente() {
        return categVente;
    }
    
    
   
}
