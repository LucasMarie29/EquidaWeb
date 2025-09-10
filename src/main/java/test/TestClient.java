package test;

import model.Client;
import model.Pays;


public class TestClient {
    
    
    public static void main (String args[]){
        
        Pays p = new Pays();
        p.setCode(1);
        p.setNom("France");
        
        Pays p1 = new Pays();
        p1.setCode(2);
        p1.setNom("Allemagne");
        
        Client c1 = new Client();
        c1.setId(3);
        c1.setNom("MARIE");
        c1.setPrenom("Lucas");
         
        Client c2 = new Client();
        c2.setId(9);
        c2.setNom("MACRON");
        c2.setPrenom("Emmanuelle");    
        
        p.addClient(c1);
        p.addClient(c2);
        
        System.out.println(p.getNom());
        
        for (Client c : p.getLesClients()){
            System.out.println("Clients : " + c.getPrenom() + " " + c.getNom());
        }
    }
    
}
