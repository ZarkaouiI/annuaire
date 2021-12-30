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
        String idParam = req.getParameter("id");
        int id = Integer.parseInt(idParam);
        switch (id){
            case 1:
                this.getServletContext().getRequestDispatcher("/vues/ajoutpersonee.hmtl").forward(req, resp);
                break;
            case 4:
                Facade facade = new Facade();
                req.setAttribute("personnes", facade.listPerson());
//                String string = "Shitty";
//                req.setAttribute("string", string);
//                for(Person person : facade.listPerson()){
//                    System.out.println(person.getPrenom() + " " + person.getNom());
//                }
                this.getServletContext().getRequestDispatcher("/vues/lister.jsp").forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idParam = req.getParameter("id");
        int id = Integer.parseInt(idParam);
        switch (id){

            case 1:
                this.getServletContext().getRequestDispatcher("/vues/ajoutpersonee.hmtl").forward(req, resp);
            case 2 :
                this.getServletContext().getRequestDispatcher("/vues/ajoutadresse.hmtl").forward(req, resp);
                break;
            case 3:
                Facade facade = new Facade();
                req.setAttribute("personnes", facade.listPerson());
                this.getServletContext().getRequestDispatcher("/vues/associer.jsp").forward(req, resp);
                break;
            case 4:
                break;
        }
    }
}

