package database;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionServlet implements ServletContextListener {
    Connection cnx = null;

    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Pilote Mariadb JDBC chargé");

            // Récupération des variables avec des valeurs de secours (defaults) pour éviter le "null"
            String host     = System.getenv("MARIADB_HOST");
            String port     = System.getenv("MARIADB_PORT");
            String database = System.getenv("MARIADB_DATABASE");
            String user     = System.getenv("MARIADB_USER");
            String password = System.getenv("MARIADB_PASSWORD");

            // Sécurité : Si les variables Railway ne sont pas chargées, on met des valeurs par défaut
            if (host == null) host = "127.0.0.1";
            if (port == null) port = "3306";
            if (database == null) database = "railway"; // ou le nom de ta base
            if (user == null) user = "root";

            String url = "jdbc:mariadb://" + host + ":" + port + "/" + database;
            System.out.println("Tentative de connexion à : " + url);

            // Ajout d'un timeout pour ne pas bloquer le serveur si la BDD est lente
            cnx = DriverManager.getConnection(url, user, password);

            // On stocke la connexion dans le contexte pour que les autres servlets y accèdent
            servletContext.setAttribute("connection", cnx);
            System.out.println("Connexion opérationnelle vers : " + url);

        } catch (ClassNotFoundException e) {
            System.out.println("ERREUR : Pilote JDBC non trouvé.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("ERREUR : Impossible de se connecter à la base de données.");
            e.printStackTrace();
        }
    }

    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("----------- Contexte détruit -----------");
        try {
            cnx.close();
            System.out.println("Connexion fermée");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erreur lors de la fermeture d'une connexion");
        }
    }
}