/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import model.Cheval;
import model.Lot;
import model.Vente;

public class TestChevalVente {
    public static void main (String args[]){
    
    Cheval c = new Cheval();
    c.setId(1);
    c.setNom("Josh");
    
    Lot l = new Lot();
    l.setId(1);
    l.setPrixDepart(155);
    
    c.addLot(l); 
    
    Vente v = new Vente();
    v.setId(1);
    v.setNom("Hiver");
    
    v.addLot(l);
    
    System.out.println(l.getCheval().getNom() + l.getVente().getNom());
    
    }
}