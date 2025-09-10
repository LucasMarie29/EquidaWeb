package model;


public class Lot {
    private int id;
    private int prixDepart;
    
    private Cheval cheval;

    public Lot() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrixDepart() {
        return prixDepart;
    }

    public void setPrixDepart(int prixDepart) {
        this.prixDepart = prixDepart;
    }

    public Cheval getCheval() {
        return cheval;
    }

    public void setCheval(Cheval cheval) {
        this.cheval = cheval;
    }
    
    
}
