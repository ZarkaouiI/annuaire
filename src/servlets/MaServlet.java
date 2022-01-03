package servlets;

import dao.Facade;
import domain.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/maservlet")
public class MaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Facade facade = new Facade();


        int id = Integer.parseInt(req.getParameter("id"));
        switch (id){
            case 1:
                this.getServletContext().getRequestDispatcher("/vues/ajoutpersonne.html").forward(req, resp);
                break;
            case 2:
                this.getServletContext().getRequestDispatcher("/vues/ajoutadresse.html").forward(req, resp);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Facade facade = new Facade();


        int id = Integer.parseInt(req.getParameter("id"));
        switch (id){
            case 1:
                String nom = req.getParameter("nom");
                String prenom = req.getParameter("prenom");

                facade.addPerson(nom, prenom);
                this.getServletContext().getRequestDispatcher("/vues/ajoutpersonne.html").forward(req, resp);
                break;
            case 2:
                String rue = req.getParameter("rue");
                String ville = req.getParameter("ville");

                facade.addAddress(rue, ville);

                this.getServletContext().getRequestDispatcher("/vues/ajoutadresse.html").forward(req, resp);
                break;
        }
    }
}

