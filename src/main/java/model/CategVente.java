package model;

import java.util.ArrayList;


public class CategVente {
    
    private int id;
    private String libelle;
    
    private CategVente categVente;
    
    private ArrayList<Vente> lesVentes;

    public CategVente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
