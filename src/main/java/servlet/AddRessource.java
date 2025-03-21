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


@WebServlet("/AddRessource")
public class AddRessource extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String nom = request.getParameter("nomRessource");
	      String type = request.getParameter("typeRessource");
	     int quantite = Integer.parseInt(request.getParameter("quantite"));
	        
	        Ressources r=new Ressources();
	        r.setNomRessource(nom);
	        r.setTypeRessource(type);
	        r.setQuantite(quantite);
	        int result=RessourcesDao.addRessource(r);
	        
	        if (result>0) {
				response.sendRedirect("DesplayRessources");
				
			} else {
				PrintWriter out = response.getWriter();
				out.println("Data not add");

			}
		
		
	}

}
