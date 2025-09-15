package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cheval {

    private int id;
    private String nom;
    private LocalDate dateNaissance;
    private String sexe;
    private String nomPere;
    private String nomMere;
    private String vendeur;
    private String codeSire;
    private String taille;
    private String poids;
    

    private Race race;
    
    private ArrayList<Lot> lesLots;

    public Cheval() {
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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Race getRace() {
        return race;
    }
    public void setRace(Race race) {
        this.race = race;
    }

    public ArrayList<Lot> getLesLots() {
        return lesLots;
    }

    public void setLesLots(ArrayList<Lot> lesLots) {
        this.lesLots = lesLots;
    }
    
    public void addLot (Lot unLot){
        if (lesLots ==null ){
            lesLots = new ArrayList<Lot>();
        }
        lesLots.add(unLot);
    }

    public String getNomMere() {
        return nomMere;
    }

    public String getNomPere() {
        return nomPere;
    }

    public String getSexe() {
        return sexe;
    }

    public String getVendeur() {
        return vendeur;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setVendeur(String vendeur) {
        this.vendeur = vendeur;
    }

    public String getCodeSire() {
        return codeSire;
    }

    public String getPoids() {
        return poids;
    }

    public String getTaille() {
        return taille;
    }

    public void setCodeSire(String codeSire) {
        this.codeSire = codeSire;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }
    
    
    
    
}
