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
            
            System.out.println("DEBUG HOST: '" + host + "'");
            System.out.println("DEBUG PORT: '" + port + "'");

            if (host == null || host.isEmpty() || host.equals("null")) {
                host = "faithful-curiosity.railway.internal";
            }
            if (port == null) port = "3306";
            if (database == null) database = "equida";
            if (user == null) user = "root";

            String url = "jdbc:mariadb://" + host + ":" + port + "/" + database;
            System.out.println("Tentative de connexion à : " + url);

   
            cnx = DriverManager.getConnection(url, user, password);

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