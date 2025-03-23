package servlet;

import java.io.IOException;
import java.util.List;

import dao.TacheDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ressources;
import model.Tache;

@WebServlet("/DesplayTache")
public class DesplayTache extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String idProjetParam = request.getParameter("idProjet");
		 
		  

	      

	        try {
	            int idProjet = Integer.parseInt(idProjetParam);
	           
	            List<Tache> taches = TacheDao.getTachesByProjet(idProjet);
	            
	            for (Tache tache : taches) {
	            	
	                List<Ressources> ressources = TacheDao.getRessourcesByTache(tache.getIdTache());
	                tache.setRessources(ressources); 
	            }

	            request.setAttribute("t", taches);
	            request.setAttribute("idProjet", idProjet);

	            request.getRequestDispatcher("GestionDesTaches.jsp").forward(request, response);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
