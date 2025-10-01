package database;


import model.Cheval;
import model.Race;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Lot;

public class DaoCheval {
    Connection cnx;
    static PreparedStatement requeteSql = null;
    static ResultSet resultatRequete = null;

    public static ArrayList<Cheval> getLesChevaux(Connection cnx) {
        ArrayList<Cheval> lesChevaux = new ArrayList<Cheval>();
        try {
            requeteSql = cnx.prepareStatement(
                "SELECT c.id as c_id, c.nom as c_nom, " +
                "r.id as r_id, r.nom as r_nom " +
                "FROM cheval c " +
                "INNER JOIN race r ON c.race_id = r.id"
            );
            resultatRequete = requeteSql.executeQuery();
            while (resultatRequete.next()) {
                Cheval c = new Cheval();
                c.setId(resultatRequete.getInt("c_id"));
                c.setNom(resultatRequete.getString("c_nom"));
                Race r = new Race();
                r.setId(resultatRequete.getInt("r_id"));
                r.setNom(resultatRequete.getString("r_nom"));
                c.setRace(r);
                lesChevaux.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLesChevaux a généré une exception SQL");
        }
        return lesChevaux;
    }
    
    

    public static Cheval getLeCheval(Connection cnx, int idCheval) {
        Cheval cheval = new Cheval();
        try {
            requeteSql = cnx.prepareStatement(
                "SELECT c.id as c_id, c.nom as c_nom, cpere.id as cpere_id, cpere.nom as cpere_nom, cmere.id as cmere_id, cmere.nom as cmere_nom, r.nom as r_nom, c.date_naissance as date_Naissance_nom " +
                "FROM cheval c " +
                "INNER JOIN race r ON c.race_id = r.id " +
                "INNER JOIN cheval cpere ON c.pere_id = cpere.id " +
                "INNER JOIN cheval cmere ON c.mere_id = cmere.id " +
                "WHERE c.id = ? "
            );
            requeteSql.setInt(1, idCheval);
            resultatRequete = requeteSql.executeQuery();
            if (resultatRequete.next()) {
                
                cheval = new Cheval();
                cheval.setId(resultatRequete.getInt("c_id"));
                cheval.setNom(resultatRequete.getString("c_nom"));
                
                java.sql.Date sqlDate = resultatRequete.getDate("date_Naissance_nom");
                if (sqlDate != null) {
                    cheval.setDateNaissance(sqlDate.toLocalDate());
                }
                
                Cheval pere = new Cheval();
                pere.setId(resultatRequete.getInt("cpere_id"));
                pere.setNom(resultatRequete.getString("cpere_nom"));
                cheval.setChevalPere(pere);
                
                Cheval mere = new Cheval();
                mere.setId(resultatRequete.getInt("cmere_id"));
                mere.setNom(resultatRequete.getString("cmere_nom"));
                cheval.setChevalMere(mere);
                
                Race race = new Race();
                race.setNom(resultatRequete.getString("r_nom"));
                
                cheval.setRace(race);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("La requête de getLeCheval a généré une exception SQL");
        }
        return cheval;
    }
    /**
     * Ajoute un nouveau cheval dans la base de données
     * @param cnx La connexion active à la base de données
     * @param cheval Le cheval à ajouter
     * @return boolean true si l'ajout a réussi, false sinon
     */
    public static boolean ajouterCheval(Connection cnx, Cheval cheval) {
    try {
        requeteSql = cnx.prepareStatement(
            "INSERT INTO cheval (nom, date_naissance, race_id) VALUES (?, ?, ?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        );
        requeteSql.setString(1, cheval.getNom());
        
        // Gestion de la date de naissance
        if (cheval.getDateNaissance() != null) {
            requeteSql.setDate(2, java.sql.Date.valueOf(cheval.getDateNaissance()));
        } else {
            requeteSql.setNull(2, java.sql.Types.DATE);
        }
        
        requeteSql.setInt(3, cheval.getRace().getId());
        
        int result = requeteSql.executeUpdate();
        
        if (result == 1) {
            // Récupération de l'id auto-généré
            ResultSet rs = requeteSql.getGeneratedKeys();
            if (rs.next()) {
                cheval.setId(rs.getInt(1));
            }
            return true;
        }
        return false;
        
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Erreur lors de l'ajout du cheval");
        return false;
    }
}
}