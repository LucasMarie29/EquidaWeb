package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cheval {

    private int id;
    private String nom;
    private LocalDate dateNaissance;
    private String sexe;
    private String vendeur;
    private String codeSire;
    private String taille;
    private String poids;
    
    private Cheval chevalPere;
    private Cheval chevalMere;
    
    private Race race;
    
    private ArrayList<Lot> lesLots;
    private ArrayList<ChevalCourse> lesChevalCourses;

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

    public String getSexe() {
        return sexe;
    }

    public String getVendeur() {
        return vendeur;
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

    public Cheval getChevalMere() {
        return chevalMere;
    }

    public void setChevalMere(Cheval chevalMere) {
        this.chevalMere = chevalMere;
    }

    public Cheval getChevalPere() {
        return chevalPere;
    }

    public void setChevalPere(Cheval chevalPere) {
        this.chevalPere = chevalPere;
    }

    public ArrayList<ChevalCourse> getLesChevalCourses() {
        return lesChevalCourses;
    }

    public void setLesChevalCourses(ArrayList<ChevalCourse> lesChevalCourses) {
        this.lesChevalCourses = lesChevalCourses;
    }
    
    public void addChevalCourse (ChevalCourse unChevalCourse){
        if (lesChevalCourses ==null ){
            lesChevalCourses = new ArrayList<ChevalCourse>();
        }
        lesChevalCourses.add(unChevalCourse);
    }
    
    
}
