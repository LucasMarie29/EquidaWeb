package test;

import java.sql.Connection;
import java.util.ArrayList;

import database.Connexionbdd;
import database.DaoCheval;
import database.DaoVente;
import model.Lieu;
import model.Vente;

public class TestConnexionBdd {

    public static void main (String args[]) {

        Connection cnx = Connexionbdd.ouvrirConnexion();
        System.out.println ("nombre de chevaux = " + DaoCheval.getLesChevaux(cnx).size());
        System.out.println("Le cheval = " + DaoCheval.getLeCheval(cnx, 2).getNom());

        System.out.println ("nombre de ventes = " + DaoVente.getLesVentes(cnx).size());
        System.out.println("La vente = " + DaoVente.getLaVente(cnx, 1).getNom());
        
        
        Vente vente = new Vente();
        vente.setNom("test3");
        vente.setDateDebutVente("2025-10-12");
        
        
        
        DaoVente.ajouterVente(cnx, vente);
        
            }

}
