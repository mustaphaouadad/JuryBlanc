package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.RessourcesDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Deleteressoures")
public class Deleteressoures extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idRessource = Integer.parseInt(request.getParameter("idRessource"));
		 int result =RessourcesDao.deleteRessource(idRessource);
		 
		 if (result > 0) {
	            response.sendRedirect("DesplayRessources"); 
	        } else {
	            PrintWriter out = response.getWriter();
	            out.println("Erreur: Impossible de supprimer la ressource.");
	        }
		
	}

}
