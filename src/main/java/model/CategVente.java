package model;

import java.util.ArrayList;


public class CategVente {
    
    private int code;
    private String libelle;
    
    private CategVente categVente;
    
    private ArrayList<Vente> lesVentes;

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
