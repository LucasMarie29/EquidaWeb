package model;

import java.util.ArrayList;


public class Pays {
    
    private int code;
    private String nom;
    
    private ArrayList<Client> lesClients;

    public Pays() {
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Client> getLesClients() {
        return lesClients;
    }

    public void setLesClients(ArrayList<Client> lesClients) {
        this.lesClients = lesClients;
    }
    
    public void addClient (Client unClient){
        if (lesClients ==null ){
            lesClients = new ArrayList<Client>();
        }
        lesClients.add(unClient);
    }
    
}
