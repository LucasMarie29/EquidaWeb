package model;

import java.sql.Date;
import java.util.ArrayList;

public class Vente {
    
    private int id;
    private String nom;
    private Date dateDebutVente;
    private Date dateFinVente;
    private Date dateDebutInscription;
    private Date dateEnvoiMessage;
    private String objetMessage;
    private String corpsMessage;
    
    private CategVente categVente;
    private Lieu lieu;
    
    private ArrayList<Lot> lesLots;
    private ArrayList<Courriel> lesCourriels;

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

    public Date getDateDebutVente(Date date) {
        return dateDebutVente;
    }

    public void setDateDebutVente(Date dateDebutVente) {
        this.dateDebutVente = dateDebutVente;
    }

    public CategVente getCategVente() {
        return categVente;
    }

    public void setCategVente(CategVente categVente) {
        this.categVente = categVente;
    }
    
    public Lieu getLieu() {
        return lieu;
    }
    public void setLieu(Lieu lieu) {
        this.lieu = lieu;
    }   

    public Date getDateDebutVente() {
        return dateDebutVente;
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

    public ArrayList<Courriel> getLesCourriels() {
        return lesCourriels;
    }

    public void setLesCourriels(ArrayList<Courriel> lesCourriels) {
        this.lesCourriels = lesCourriels;
    }
    
    public void addCourriel (Courriel unCourriel){
        if (lesCourriels ==null ){
            lesCourriels = new ArrayList<Courriel>();
        }
        lesCourriels.add(unCourriel);
    }

    public Date getDateDebutInscription() {
        return dateDebutInscription;
    }

    public Date getDateEnvoiMessage() {
        return dateEnvoiMessage;
    }

    public Date getDateFinVente() {
        return dateFinVente;
    }

    public String getObjetMessage() {
        return objetMessage;
    }

    public void setDateDebutInscription(Date dateDebutInscription) {
        this.dateDebutInscription = dateDebutInscription;
    }

    public void setDateEnvoiMessage(Date dateEnvoiMessage) {
        this.dateEnvoiMessage = dateEnvoiMessage;
    }

    public void setDateFinVente(Date dateFinVente) {
        this.dateFinVente = dateFinVente;
    }

    public void setObjetMessage(String objetMessage) {
        this.objetMessage = objetMessage;
    }

    public String getCorpsMessage() {
        return corpsMessage;
    }

    public void setCorpsMessage(String corpsMessage) {
        this.corpsMessage = corpsMessage;
    }
    
    
    
}
