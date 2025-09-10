package model;


public class Enchere {
    private int numero;
    private int montant;
    
    private Acheteur acheteur;
    private Lot lot;

    public Enchere() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Acheteur getAcheteur() {
        return acheteur;
    }

    public void setAcheteur(Acheteur acheteur) {
        this.acheteur = acheteur;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }
    
    
    
}
