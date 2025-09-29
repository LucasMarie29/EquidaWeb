package servlet;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import database.DaoCheval;
import database.DaoRace;
import database.DaoVente;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import model.Cheval;
import model.Lieu;
import model.Lot;
import model.Vente;

@WebServlet(name = "venteServlet", value = "/vente-servlet/*")
public class VenteServlet extends HttpServlet {

    Connection cnx;
    
    @Override
    public void init() {
        ServletContext servletContext = getServletContext();
        cnx = (Connection)servletContext.getAttribute("connection");
        try {
            System.out.println("INIT SERVLET=" + cnx.getSchema());
        } catch (SQLException ex) {
            Logger.getLogger(VenteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String path = request.getPathInfo();
        System.out.println("PathInfo: " + path);

        if ("/list".equals(path)) {
            ArrayList<Vente> lesVentes = DaoVente.getLesVentes(cnx);
            request.setAttribute("pLesVentes", lesVentes);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/list.jsp").forward(request, response);
        }
        if ("/show".equals(path)) {
            try {
                int idVente = Integer.parseInt(request.getParameter("idVente"));
                Vente laVente = DaoVente.getLaVente(cnx, idVente);
                ArrayList<Lot> lesLots = DaoVente.getLesLots(cnx, idVente);

                if (laVente != null) {
                    request.setAttribute("pLaVente", laVente);
                    request.setAttribute("pLesLots", lesLots);
                    this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/show.jsp").forward(request, response);
                } else {
                    response.sendRedirect(request.getContextPath() + "/vente-servlet/lister");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : l'id de la vente n'est pas un nombre valide");
                response.sendRedirect(request.getContextPath() + "/vente-servlet/lister");
            }

        }

        if ("/add".equals(path)) {
            ArrayList<Vente> lesVentes = DaoVente.getLesVentes(cnx);
            request.setAttribute("pLesVentes", lesVentes);
            this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/add.jsp").forward(request, response);
        }
        


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getPathInfo();

        if ("/add".equals(path)) {
            try {
                // Récupération des données du formulaire
                String nom = request.getParameter("nom");
                String dateDebutVentestr = request.getParameter("dateDebutVente");

                // Création d'un nouveau cheval
                Vente nouvelVente = new Vente();
                nouvelVente.setNom(nom);

                
                if (dateDebutVentestr != null && !dateDebutVentestr.isEmpty()) {
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date dateDebutVente = (Date) sdf.parse(dateDebutVentestr);
                        nouvelVente.setDateDebutVente(dateDebutVente);
                    } catch (ParseException e) {
                        e.printStackTrace();
                        
                    }
}


                // Tentative d'ajout en base de données
                if (DaoVente.ajouterVente(cnx, nouvelVente)) {
                    
                    response.sendRedirect(request.getContextPath() + "/vente-servlet/show?idVente=" + nouvelVente.getId());
                } else {
                    throw new Exception("Erreur lors de l'enregistrement de la vente");
                }

            } catch (NumberFormatException e) {
                request.setAttribute("message", "Erreur lors de l'enregistrement. Veuillez vérifier les champs.");
                this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/add.jsp").forward(request, response);

                this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/add.jsp").forward(request, response);
            } catch (Exception e) {
                request.setAttribute("message", "Erreur lors de l'enregistrement. Veuillez vérifier les champs.");
                this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/add.jsp").forward(request, response);

                this.getServletContext().getRequestDispatcher("/WEB-INF/views/vente/add.jsp").forward(request, response);
            }
        }
    }

    public void destroy() {
    }
}