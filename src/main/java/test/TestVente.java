package test;

import model.Cheval;
import model.Race;
import model.Vente;

public class TestVente {
    public static void main (String args[]){
    
        Vente v = new Vente();
        v.setId(1);
        v.setNom("Vente1");
        
        
        Race r1 = new Race();
        r1.setId(6);
        r1.setNom("Lipizzan");
        
        Race r2 = new Race();
        r2.setId(2);
        r2.setNom("Frison");
        
        Race r3 = new Race();
        r3.setId(4);
        r3.setNom("Andalou");
        
        v.addRace(r1);
        v.addRace(r2);
        v.addRace(r3);
        
        System.out.println("Il y a plusieurs ventes actifs, dont :");
        
        System.out.println("- " + v.getNom());

        for (Race r : v.getLesRaces()){
            System.out.println("Cheval numéro : " + v.getId() + " " + v.getNom());
        }
        
        
        
        
    }
}
