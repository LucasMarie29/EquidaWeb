package model;

import java.util.ArrayList;



public class Vente {
    
    private int id;
    private String nom;
    private String dateDebutVente;
    
    private CategVente categVente;
    
    private ArrayList<Race> lesRaces;

    public Vente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateDebutVente(String string) {
        return dateDebutVente;
    }

    public void setDateDebutVente(String dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public CategVente getCategVente() {
        return categVente;
    }

    public void setCategVente(CategVente categVente) {
        this.categVente = categVente;
    }

    public void setLesRaces(ArrayList<Race> lesRaces) {
        this.lesRaces = lesRaces;
    }

    public ArrayList<Race> getLesRaces() {
        return lesRaces;
    }
    
    public void addRace(Race uneRace){
        if (lesRaces ==null ){
            lesRaces = new ArrayList<Race>();
        }
        lesRaces.add(uneRace);
    }
    
}
