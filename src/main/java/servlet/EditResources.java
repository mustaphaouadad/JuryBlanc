package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.RessourcesDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ressources;


@WebServlet("/EditResources")
public class EditResources extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  int idRessource = Integer.parseInt(request.getParameter("idRessource"));
		  Ressources r =RessourcesDao.getRessourceById(idRessource);
		  request.setAttribute("r",r);
		  request.getRequestDispatcher("EditResource.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idRessource = Integer.parseInt(request.getParameter("idRessource"));
        String nom = request.getParameter("nomRessource");
        String type = request.getParameter("typeRessource");
        int quantite = Integer.parseInt(request.getParameter("quantite"));
        int idFournisseur = 1;
        
        Ressources r=new Ressources();
        r.setIdRessource(idRessource);
        r.setNomRessource(nom);
        r.setTypeRessource(type);
        r.setQuantite(quantite);
        r.setIdFournisseur(idFournisseur);
        
        int result =RessourcesDao.updateRessource(r);
        
        if (result>0) {
        	response.sendRedirect("DesplayRessources");
			
		} else {
			PrintWriter out=response.getWriter();
			out.println("Eroor while updating");

		}

		
	}

}
