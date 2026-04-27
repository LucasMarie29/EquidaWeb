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
        System.out.println("INITCONNEXION" + servletContext.getContextPath());
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Pilote Mariadb JDBC chargé");
            try {
                String host     = System.getenv("MARIADB_HOST");
                String port     = System.getenv("MARIADB_PORT");
                String database = System.getenv("MARIADB_DATABASE");
                String user     = System.getenv("MARIADB_USER");
                String password = System.getenv("MARIADB_PASSWORD");

                String url = "jdbc:mariadb://" + host + ":" + port + "/" + database;
                System.out.println("Tentative de connexion à : " + url);

                cnx = DriverManager.getConnection(url, user, password);
                servletContext.setAttribute("connection", cnx);
                System.out.println("Connexion opérationnelle : " + url);
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Erreur lors de l'établissement de la connexion");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur lors du chargement du pilote");
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